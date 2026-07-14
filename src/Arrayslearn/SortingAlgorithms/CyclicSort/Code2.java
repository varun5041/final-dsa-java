package Arrayslearn.SortingAlgorithms.CyclicSort;

import java.util.Arrays;

public class Code2 {
    static void main(String[] args) {
        int[] arr = {1,2,0};

        Cyclic2(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void Cyclic2(int[] arr) {
        int n = arr.length;

        int i =0;

        while(i<n){
            int correct=arr[i]-1;
            if(i!=arr[i]-1 && arr[correct]!=arr[i]){
                //swap
                int temp = arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else {
                i++;
            }
        }




    }


}
