package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;

public class SetMismatch {
    static void main(String[] args) {
        int[] arr= {};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] nums) {

        int n = nums.length;

        int i =0;

        while(i<n){
            int correct=nums[i]-1;
            if(i!=nums[i]-1 && nums[correct]!=nums[i]){
                //swap
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else {
                i++;
            }
        }


        for (int j =0; j<n ;j++){
            if(j!=nums[j]-1){
                return new int[]{nums[j],j+1};
            }
        }

        return new int[]{-1,-1};
    }
}
