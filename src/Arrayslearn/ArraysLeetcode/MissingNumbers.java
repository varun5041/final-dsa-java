package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;

public class MissingNumbers {
    static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNumber(arr));

    }

    public static int missingNumber(int[] nums){
        int n = nums.length;

        int ans=n;
        for (int i = 0; i<n ; i++){
            while(nums[i]<n-1 && i!=nums[i] ){
                int temp = nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
        }
//        System.out.println(Arrays.toString(nums));


        for (int i = 0;i<n;i++){
            if(i!=nums[i]){
               return i;
            }
        }


        return nums.length;
    }
}
