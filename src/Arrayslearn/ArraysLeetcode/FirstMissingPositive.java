package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;

public class FirstMissingPositive {
    static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(firstMissingPositive(arr));;
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        int i =0;

        while(i<n){
            int correct=nums[i]-1;
            if( (nums[i]>0 && nums[i]<=n) && i!=nums[i]-1 && nums[i]!=nums[correct]){
                //swap
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else {
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));
        for (int j = 0 ;j<n;j++){
            if(j!=nums[j]-1){
                return j+1;
            }
        }

        return n+1;
    }
}
