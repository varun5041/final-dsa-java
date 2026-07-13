package Arrayslearn.SortingAlgorithms.CyclicSort;

import java.util.Arrays;

public class Code {
    static void main(String[] args) {
        int[] arr = {2,2,1};

        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Cyclic(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int value=arr[i];
            while(i!=value-1){
                //swap
                int temp = arr[i];
                arr[i]=arr[value-1];
                arr[value-1]=temp;
                value=arr[i];
            }
        }
    }
}
