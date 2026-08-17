package Recursion.Sorting;

import Recursion.MergeSortedArray;

import java.util.Arrays;

import static Recursion.MergeSortedArray.MergeArrays;

public class MergeSort {
    static void main(String[] args) {
        int[] arr = {8,3,4,12,5};
        MergeSortInPlace(arr,0,4);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] Sort(int[] arr) {
        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = Sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = Sort(Arrays.copyOfRange(arr,mid,arr.length));

        return MergeArrays(left,right);
    }

    private static void MergeSortInPlace(int[] arr, int start, int end){
        int length = end-start+1;
        if(length==1){
            return;
        }

        int mid = start +(end-start)/2;

        MergeSortInPlace(arr,start,mid);
        MergeSortInPlace(arr,mid+1,end);

        MergeSortedArrayInPlace(arr,start,mid,end);
    }

    public static void MergeSortedArrayInPlace(int[] arr, int start, int mid, int end) {
//        int n = mid-start+1;
//        int m =end-(mid+1);
        int[] resultArray = new int[end-start+1];
        int resultpointer = 0;//resultArrray
        int i=start;//arr1
        int j=mid+1;//arr2

        while (i<=mid && j<=end){
            if(arr[i]<arr[j]){
                resultArray[resultpointer]= arr[i];
                resultpointer++;
                i++;
            } else if (arr[i]>arr[j]) {
                resultArray[resultpointer]=arr[j];
                resultpointer++;
                j++;
            }else{
                resultArray[resultpointer]=arr[i];
                resultpointer++;
                resultArray[resultpointer]=arr[j];
                resultpointer++;
                i++;
                j++;
            }
        }

        while(i<=mid){
            resultArray[resultpointer++]=arr[i++];
        }

        while(j<=end){
            resultArray[resultpointer++]=arr[j++];
        }


        for (int k = 0 ;k < resultArray.length;k++){
            arr[start+k]=resultArray[k];
        }
    }


}
