package Arrayslearn.SortingAlgorithms.BubbleSort;

import java.util.Arrays;

public class BubblesortCode {
    static void main() {
        int[] arr ={2,5,4,3,9};
        BubbleSortCode(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void BubbleSortCode(int[] arr){
        int n = arr.length;

        boolean isSwapped;
        //Run the Steps n-1 Times
        for (int i = 0; i < n; i++) {
            isSwapped = false;
            //for each step the inner loop will go till the last respective index
            for (int j = 1; j <= n-i-1; j++) {
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                    isSwapped = true;
                }
            }

            //if for a particular step(i) if no swap occurs it means array is sorted
            //break out of i loop so it does not increment
            if (!isSwapped){
                break;
            }
        }
    }
}
