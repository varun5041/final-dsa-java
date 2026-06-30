package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;

public class MoveZeroToEnd {
    static void main(String[] args) {
        int arr[]={1,2,3,4,};
        System.out.println(Arrays.toString(MoveZeros(arr)));
    }

    public static int[] MoveZeros(int[] nums) {
        int n = nums.length;
        int j =0;
        //find first zero
        int FirstZero = FindFirstZero(nums);
        if(FirstZero==-1){
            return nums;
        }
        j=FirstZero;
        for(int i = j+1;i<n;i++){

            if(nums[i]!=0){
                SwapinArray(nums,i,j);
                j++;
            }

        }
        return nums;
    }

    public static int[] SwapinArray(int[] arr,int index1,int index2){
             int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }

    public static int FindFirstZero(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                return i;
            }
        }
        return -1;
    }


}
