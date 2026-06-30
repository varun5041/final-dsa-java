package Arrayslearn.BinarySearchalgo;

import java.util.Scanner;

public class code {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //array sorted in ascending order
        int arr[] = {2,3,4,5,6,7,10,18,21,22,44,64,84,100};
        System.out.println(binarysearchfor(arr,64));
    }

    private static int binarysearchfor(int[] arr,int target) {

        int start = 0;
        int end = arr.length-1;
        while(end>=start){

            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;//left side search space
            }else if(target>arr[mid]){
                start=mid+1;   //right side search space
            }else{
                return mid; //target found
            }
        }

        return -1;

    }
}
