package Recursion;

import java.util.Arrays;

public class MergeSortedArray {
    static void main(String[] args) {
        int[] arr1={2,4,6,8,10,12,14};
        int[] arr2={3,5,7,9};

        System.out.println(Arrays.toString(MergeArrays(arr1,arr2)));
    }

    public static int[] MergeArrays(int[] arr1, int[] arr2) {
        int n=arr1.length;
        int m = arr2.length;
        int[] resultArray = new int[m+n];
        int resultpointer = 0;//resultArrray
        int i=0;//arr1
        int j=0;//arr2

        while (i!=n && j!=m){
            if(arr1[i]<arr2[j]){
               resultArray[resultpointer]= arr1[i];
               resultpointer++;
                i++;
            } else if (arr1[i]>arr2[j]) {
                resultArray[resultpointer]=arr2[j];
                resultpointer++;
                j++;
            }else{
                resultArray[resultpointer]=arr1[i];
                resultpointer++;
                resultArray[resultpointer]=arr2[j];
                resultpointer++;
                i++;
                j++;
            }
        }

        while(i!=n){
            resultArray[resultpointer++]=arr1[i++];
        }

        while(j!=m){
            resultArray[resultpointer++]=arr2[j++];
        }


        return resultArray;


    }
}
