package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;

public class LeftRotateByOne {
    static void main(String[] args) {
        int arr [] ={2,3,5,7,9};
        System.out.println(Arrays.toString(LeftRotateone(arr)));
    }

    private static int[] LeftRotateone(int[] arr) {

        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }

        arr[arr.length-1]=temp;
        return arr;
    }
}
