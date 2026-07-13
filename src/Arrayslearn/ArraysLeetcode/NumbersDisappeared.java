package Arrayslearn.ArraysLeetcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumbersDisappeared {
    static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};

       System.out.println(findDisappearedNumbers(arr));;
    }

    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n =  nums.length;
//        int ans=0;

        for (int i = 0 ;i<n ;i++){
            while(i!=nums[i]-1 && nums[nums[i]-1]!=nums[i]){
                int correctIndex=nums[i]-1;
                //swap
                int temp = nums[i];
                nums[i]=nums[correctIndex];
                nums[correctIndex]=temp;

            }
        }

        System.out.println(Arrays.toString(nums));

        for(int i =0;i<n;i++){
            if(i!=nums[i]-1){
                ans.add(nums[i]);
            }
        }

        return ans;
    }
}
