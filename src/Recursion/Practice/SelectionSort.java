package Recursion.Practice;

import java.util.Arrays;

import static Recursion.Practice.BubbleSort.RecursiveBubbleSort;

public class SelectionSort {
    static void main(String[] args) {
        int[] arr= {3,2,7,10,100,5,12};
        int n = arr.length;
        System.out.println(Arrays.toString(RecursiveBubbleSort(arr,0,n-1)));
    }

    public static int[] RecursiveSelectionSort(int[] arr, int start, int end) {
        if(end==start){
            return arr;
        }
        int largest=arr[start];
        int largestIndex=start;
        //get the largest Index
        largestIndex=sortArrays(arr,start+1,end,largestIndex,largest);
        //swap the end with the largest index
        swap(arr,largestIndex,end);
        return RecursiveSelectionSort(arr,start,end-1);
    }

    private static int sortArrays(int[] arr, int j, int end,int largestIndex,int Largest) {
        if(j>end){
            return largestIndex;
        }

        if(arr[j]>Largest){
            largestIndex=j;
            Largest=arr[j];

        }

        return sortArrays(arr,j+1,end,largestIndex,Largest);
    }

    public static void swap(int[] arr,int index1 ,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
