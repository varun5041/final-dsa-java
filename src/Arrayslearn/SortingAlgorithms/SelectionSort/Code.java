package Arrayslearn.SortingAlgorithms.SelectionSort;

import java.util.Arrays;

public class Code {
    static void main(String[] args) {
        int[] arr = {-1,-2,8,13,10,10};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void SelectionSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int largest = arr[0];
            int largestIndex=0;
            for (int j = 0; j <= n-i-1; j++) {
                if(arr[j]>largest){
                    largest = arr[j];
                    largestIndex=j;
                }
            }
            SwapinArray(arr,largestIndex,n-i-1);
        }
    }

    public static int[] SwapinArray(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }

}
