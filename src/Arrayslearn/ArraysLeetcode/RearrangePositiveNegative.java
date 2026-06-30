package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;

public class RearrangePositiveNegative {
    static void main(String[] args) {
        int arr[]={-3,-1,2,-5,3,4};

        System.out.println(Arrays.toString(Rearrange(arr)));
    }

    private static int[] Rearrange(int[] nums) {
        int n=nums.length;
        int ans[] = new int[n];
        int positiveptr=0;
        int negativeptr=1;
        for(int i =0;i<n;i++){
            if(nums[i]>0){
                ans[positiveptr]=nums[i];
                positiveptr+=2;
            }else{
                ans[negativeptr]=nums[i];
                negativeptr+=2;
            }
        }
        return ans;
    }


}
