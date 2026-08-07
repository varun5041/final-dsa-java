package Recursion.Practice;

import java.util.Arrays;

public class BubbleSort {
    static void main(String[] args) {
        int[] arr= {100,5,4,3,2,1};
        int n = arr.length;
        System.out.println(Arrays.toString(RecursiveBubbleSort(arr,1,n-2)));
    }

    public static int[] RecursiveBubbleSort(int[] arr, int start, int end) {
        if(end==start){
            return arr;
        }

        //Sort
        sortArrays(arr,start+1,end);
        //Recursive call
        return RecursiveBubbleSort(arr,start,end-1);
    }

    private static int[] sortArrays(int[] arr, int j, int end) {
        if(j>end){
            return arr;
        }

        if(arr[j]<arr[j-1]){
            swap(arr,j,j-1);
        }

        return sortArrays(arr,j+1,end);
    }

    public static int[] swap(int[] arr,int index1 ,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }
}
