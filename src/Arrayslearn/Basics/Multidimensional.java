package Arrayslearn.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    /*
        1 2 3
        4 5 6
        7 8 9
     */
                        //no of rows is manditory //no of columns is not manditory
//    int[][] arr= new int[3][3];

//        int[][] nums= {
//            {1,2,3},
//            {4,5,6},
//            {7,8,9},
//        };
//
//        System.out.println(Arrays.deepToString(nums));
//
//        //iterating
//        System.out.println(nums[1][2]); //6
//        System.out.println(Arrays.toString(nums[1]));
//
//        System.out.println(nums.length); //gives no of rows

        int[][] arr = new int[3][3];
        System.out.println("length =" + arr.length);
//        input
        for(int row = 0; row<arr.length; row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
        }

        System.out.println("display with enhanced for loop");
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println("display with deep to string");
        System.out.println(Arrays.deepToString(arr));


        System.out.println("display with double normal for loop");
        for(int row = 0; row<arr.length; row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }


}
