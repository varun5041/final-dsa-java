package Arrayslearn.ArraysLeetcode;

import java.util.*;

public class MajorityElement2 {
    static void main(String[] args) {
        int arr[] = {-1,-1,-1};
        System.out.println(FindMajority2optimal(arr));
    }

    private static List<Integer> FindMajority2(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if((entry.getValue())>(n/3)){
                ans.add(entry.getKey());
            }
        }
        return ans;

    }

    //optimal moore:s Voting Algorithm
    public static List<Integer> FindMajority2optimal(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int majorityElement1=Integer.MIN_VALUE;
        int majorityElement2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        for (int i =0;i<n;i++){
            if(count1==0 && nums[i]!=majorityElement2){
                majorityElement1=nums[i];
                count1=1;
            } else if (count2==0 && nums[i]!=majorityElement1){
                majorityElement2=nums[i];
                count2=1;
            }  else if (nums[i]==majorityElement1) {
                count1++;
            } else if (nums[i]==majorityElement2) {
                count2++;
            }else {
                count2--;
                count1--;
            }
        }
        int counter1=0;
        int counter2=0;
        for (int i = 0;i<n;i++){
            if(nums[i]==majorityElement1){
                counter1++;
            }
            if (nums[i]==majorityElement2) {
                counter2++;
            }
        }

        if(counter1>n/3){
            ans.add(majorityElement1);
        }
        if(counter2>n/3){
            ans.add(majorityElement2);
        }
        Collections.sort(ans);

        return ans;


    }





}
