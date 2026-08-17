package Recursion.Sorting;

import java.sql.SQLOutput;
import java.util.Arrays;

import static Functions.Main.swap;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr={3,11,9,6,2,10};
        QuickSortALgo(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void swapInArray(int[] arr,int start, int end) {
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }


    private static void QuickSortALgo(int[] arr, int low, int high) {

        if(low>=high){
            return;
        }

        int mid = low+(high-low)/2;
        int pivot = arr[mid];
        int start = low;
        int end= high;

        while(start<=end){
            while (arr[start]<pivot){
                start++;
            }
            while(arr[end]>pivot){
                end--;
            }
            if(start<=end) {
                swapInArray(arr, start, end);
                start++;
                end--;
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("start = " + start + "end="+ end );
        QuickSortALgo(arr,low,end);
        QuickSortALgo(arr,start,high);
    }
}
