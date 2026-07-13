package Arrayslearn.SortingAlgorithms.InsertionSort;

import java.util.Arrays;

public class Code {
    static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    
    public static void InsertionSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i <= n-2; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else {
                    //arr[j]>=arr[j-1]
                    break;
                }
            }
        }
    }
}
