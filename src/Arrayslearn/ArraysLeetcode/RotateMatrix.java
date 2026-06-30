package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;

public class RotateMatrix {
    static void main(String[] args) {
        int[][] arr = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9},

                {5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}

        };
//        System.out.println(Arrays.deepToString(transpose(arr)));
        System.out.println(Arrays.deepToString(rotate90(arr)));
    }

    private static int[][] rotate90(int[][] arr) {
        //transpose of the matrix
        transpose(arr);
        //mirror
        mirrorMatrix(arr);

        return arr;

    }

    public static void transpose(int[][] arr){
        int order = arr.length;
        for (int i = 0 ; i< order;i++){
            for (int j = 0; j< order;j++){
                if(j>i){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
        }


    }

    public static void mirrorMatrix(int[][] arr){
        int order = arr.length;

        for (int i =0;i<order;i++){
            reverse(arr[i],0,order-1);
        }
    }

    public static void reverse(int[] arr, int left, int right) {

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }


}
