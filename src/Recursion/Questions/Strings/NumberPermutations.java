package Recursion.Questions.Strings;

import java.util.*;

public class NumberPermutations {
    static void main(String[] args) {
        int[] arr= {1,2,3};

        System.out.println(getNumberPermutations(arr));

    }

    private static List<List<Integer>> getNumberPermutations(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
//        List<Integer> processed = new ArrayList<>();
//        boolean[] map = new boolean[nums.length];
//        ans = PermutStringNums(processed,nums,map);
        PermutStringNumsOptimal(nums,0,ans);
        return ans;
    }

    private static void PermutStringNumsOptimal(int[] nums, int index, List<List<Integer>> ans) {
        if(index==nums.length){
            List<Integer> temp = new ArrayList<>();
            for (int i : nums){
                temp.add(i);
            }
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < nums.length; i++) {
            //swap index with i
            int temp = nums[index];
            nums[index]=nums[i];
            nums[i]=temp;
            //call function
           PermutStringNumsOptimal(nums,index+1,ans);
           //backtrack
           int temp2 = nums[index];
           nums[index]=nums[i];
           nums[i]=temp2;
        }
    }

    public static List<List<Integer>> PermutStringNums(List<Integer> processed, int[] unprocessed, boolean[] map) {
        List<List<Integer>> ans = new ArrayList<>();
        if (processed.size() == unprocessed.length) {
            ans.add(processed);
            return ans;
        }
        for (int i = 0; i < unprocessed.length; i++) {
            if (map[i] == true) {
                continue;
            }
            List<Integer> newProcessed = new ArrayList<>();
            newProcessed.addAll(processed);
            newProcessed.add(unprocessed[i]);
            map[i] = true;
            ans.addAll(PermutStringNums(
                    newProcessed,
                    unprocessed,
                    map
            ));
            //backtrack
            map[i] = false;
        }
        return ans;
    }
}
