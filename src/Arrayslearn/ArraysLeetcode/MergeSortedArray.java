package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;

public class MergeSortedArray {
    static void main(String[] args) {
        int[] num1 ={1,2,3,0,0,0};
        int[] num2 ={2,4,5};
        int n = num2.length;
        int m = num1.length-num2.length;
        mergeArrays3(num1,m,num2,n);
        System.out.println(Arrays.toString(num1));
    }

    public static void mergeArrays3(int[] nums1,int m,int[] nums2,int n){
        int i = m-1;
        int j = n-1;
        int k = m + n - 1;

        //koi ek zero ho jaye to loop band
        while(i>=0 && j>=0){
            if(nums2[j]>=nums1[i]){
                nums1[k]=nums2[j];
                j--;
                k--;
            }else{
                nums1[k]=nums1[i];
                i--;
                k--;
            }

        }

        while(j>=0){
            nums1[k]=nums2[j];
            k--;
            j--;
        }
    }

    private static void mergeArrays(int[] num1, int m, int[] num2, int n) {

        m=num1.length;
        n=num2.length;
        for (int i = 0; i < n; i++) {
            num1[m-n+i] = num2[i];
        }
        Arrays.sort(num1);
    }


















    //meri galat apprioach
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
