package Recursion.Questions.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class SubsetsOfIntegers {
    static void main(String[] args) {
        int[] arr ={1,2,2};

//        System.out.println(PrintSubsets(arr));
        System.out.println(GetSubSetsWithDuplicates(arr));
    }

    private static List<List<Integer>> PrintSubsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> processed = new ArrayList<>();
        ans = SubsetPrinter(nums,processed,0);
        return ans;
    }

   public static List<List<Integer>> SubsetPrinter(int[] arr, List<Integer> processed,int index) {
       List<List<Integer>> ans = new ArrayList<>();
       if (index == arr.length) {
           ans.add(processed);
           return ans;
       }
       ArrayList<Integer> newProcessed = new ArrayList<>(processed);
       newProcessed.add(arr[index]);

       List<List<Integer>> left = SubsetPrinter(arr, newProcessed, index + 1);
       List<List<Integer>> right = SubsetPrinter(arr, processed, index + 1);

       ans.addAll(left);
       ans.addAll(right);
       return ans;
   }

   public static List<List<Integer>> GetSubSets(int arr[]){
       List<List<Integer>> ans = new ArrayList<>();

       ans.add(new ArrayList<>()); // start with empty subset

       for (int i = 0; i < arr.length; i++) {

           List<List<Integer>> newList = new ArrayList<>();
            System.out.println(ans.size());
           for (List<Integer> list : ans) {

               List<Integer> newSubset = new ArrayList<>(list);
               newSubset.add(arr[i]);

               newList.add(newSubset);
           }

           ans.addAll(newList);
       }

       return ans;
   }

    public static List<List<Integer>> GetSubSetsWithDuplicates(int nums[]){
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int start = 0;
        int end=1;
        ans.add(new ArrayList<>());

        for (int i = 0; i < nums.length; i++) {
            boolean IsADuplicate = i>0 && nums[i]==nums[i-1];
            List<List<Integer>> newList = new ArrayList<>();
            if(!IsADuplicate){
                //if not duplicate traverse previous entire answer
            for (List<Integer> list : ans) {

                List<Integer> newSubset = new ArrayList<>(list);
                newSubset.add(nums[i]);

                newList.add(newSubset);
            }}else {
                //if duplicate then traverse the previous newList
                for (int index = start ;index<=end;index++){
                    List<Integer> newSubset = new ArrayList<>(ans.get(index));
                    newSubset.add(nums[i]);
                    newList.add(newSubset);
                }
            }
            ans.addAll(newList);
            start=end+1;
            end=ans.size()-1;
        }

        return ans;
    }

}
