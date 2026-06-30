package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;

public class RemoveElement
{
    static void main(String[] args) {
        int arr[] = {3,2,2,3};
        System.out.println(removeElement(arr,3));
    }
    public static int removeElement(int[] nums,int val) {
        int n = nums.length;
        int j =0;
        //find first value
        int FirstValue = FindFirst(nums,val);
        if(FirstValue==-1){
            return nums.length;
        }
        j=FirstValue;
        for(int i = j+1;i<n;i++){

            if(nums[i]!=val){
                SwapinArray(nums,i,j);
                j++;
            }

        }
        return j;
    }

    public static int[] SwapinArray(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }

    public static int FindFirst(int arr[],int value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==value){
                return i;
            }
        }
        return -1;
    }
}
