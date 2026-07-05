package Arrayslearn.ArraysLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Threesum {
    static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));
    }


    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n-1; i++) {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
           int j= i+1;
           int k = n-1;

           while(k>j){
               int sum=nums[i]+nums[j]+nums[k];
               if(sum==0){
                   result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                   j++;
                   k--;
                   while(k>j && nums[k]==nums[k+1]){
                       k--;
                   }
                   while(k>j && nums[j]==nums[j-1]) {
                       j++;
                   }
               } else if (sum>0) {
                   k--;
               }else {
                   j++;
               }
           }
        }
        return result;
    }
}
