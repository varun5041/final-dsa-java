package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;

public class NextPermutation {
    static void main(String[] args) {
        int[] arr = {2,3,1,3,3};
        System.out.println(Arrays.toString(nextPermutation(arr)));
    }

    public static int[] nextPermutation(int[] nums) {
        int n = nums.length;
        //step 1 : find a pivot
        int pivot=-1;
        for (int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(nums,0,n-1);
            return nums;
        }

        //step 2:find smallest element index next to pivot and greater the piviot element
        int smallest=Integer.MAX_VALUE;
        int toSwapIndex=-1;
        for (int i=pivot+1;i<n;i++){
            if(nums[i]>nums[pivot]&&nums[i]<=smallest){
                    smallest=nums[i];
                    toSwapIndex=i;
            }
        }

        //step 3:swap
        SwapinArray(nums,pivot,toSwapIndex);

//        System.out.println(Arrays.toString(nums));

        //step 4:reverse elements next to pivot
        reverse(nums,pivot+1,n-1);
//        System.out.println(Arrays.toString(nums));

        return nums;

    }

    public static void reverse(int[] arr, int left, int right) {

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static int[] SwapinArray(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }


}
