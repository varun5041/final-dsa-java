package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;

public class MergeSortedArray {
    static void main(String[] args) {
        int[] num1 ={2,4,6,0,0,0};
        int[] num2 ={1,3,5};
        int m = num1.length;
        int n = num2.length;
        mergeArrays2(num1,m,num2,n);
        System.out.println(Arrays.toString(num1));
    }

    private static void mergeArrays(int[] num1, int m, int[] num2, int n) {

        m=num1.length;
        n=num2.length;
        for (int i = 0; i < n; i++) {
            num1[m-n+i] = num2[i];
        }
        Arrays.sort(num1);
    }

    public static void mergeArrays2(int[] nums1,int m,int[] nums2,int n){
        m = nums1.length;
        n = nums2.length;

        int i=0;
        int j=0;
        int k = m-n;

        while(i<k && i<n){
            if(nums2[j]>=nums1[i]){
                i++;
            } else if (nums1[i]>nums2[j]) {
                SwapinArray(nums1,i,k);
                nums1[i]=nums2[j];
                j++;
                k++;
                i++;
            }
        }

        if(i==k && i<n){
            while(i<m){
                nums1[i] = nums2[j];
                i++;
                j++;
                k++;
            }
        }

    }

    public static int[] SwapinArray(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }


}
