package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;

public class twoSumsSorted {
    static void main(String[] args) {
        int nums[] = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums,9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;

        while (j>i){
            int sum=nums[i]+nums[j];
            if(sum<target){
                i++;
            }else if (sum>target){
                j--;
            }else {
                return new int[]{i+1,j+1};
            }
        }
        return new int[]{-1,-1};
    }
    }
