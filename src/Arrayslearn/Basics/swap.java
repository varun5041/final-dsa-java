package Arrayslearn.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr= {2,3,4,5000,6};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,2);
        System.out.println(Arrays.toString(arr));
        System.out.println("largest is "+max(arr));
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void swap(int[] arr,int index1 ,int index2){
        int temp;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }


    public static int max(int[] arr){
        int largest=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }

        return largest;
    }

    public static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(end>start){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}

