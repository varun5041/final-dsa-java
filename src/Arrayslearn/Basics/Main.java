package Arrayslearn.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("arrys first");
        int arr[] = new int[5];


        //input
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        //display()enhanced for loop
        for (int j : arr) {
            System.out.print(j);
            System.out.print(",");
        }

        System.out.println();
        //for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(",");
        }
        System.out.println();
        //arrays class
        System.out.println(Arrays.binarySearch(arr,3));
        System.out.println(Arrays.toString(arr));
    }
}
