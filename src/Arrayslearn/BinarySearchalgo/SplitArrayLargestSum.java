package Arrayslearn.BinarySearchalgo;

import java.util.Arrays;

public class SplitArrayLargestSum {
    static void main(String[] args) {
        int[] arr = {7,2,5,10,8};

      System.out.println(splitArray(arr,2));


    }

    public static int splitArray(int[] arr, int k) {
        int start = largestinArray(arr);
        int end=sumofArray(arr);

        while(end>start){
            int mid=start+(end-start)/2;
            int partitions = partionsCalculator(arr,mid);
            if(partitions>k){
                start=mid+1;
            } else{
                end=mid;
            }
        }

        return start;

    }

    public  static int partionsCalculator(int[] arr, int mid) {
        int limit = mid;
        int sum=0;
        int ans=0;

        for(int num : arr) {

            if (num + sum > limit) {
                sum=num;
                ans++;
            } else {
                sum+=num;
            }

        }
        ans++;
        return ans;

    }

    private static int sumofArray(int[] arr) {
        int sum=0;
        for (int i : arr){
            sum+=i;
        }
        return sum;
    }

    private static int largestinArray(int[] arr) {
        int largest=0;
        for (int i : arr){
            if(i > largest){
                largest=i;
            }
        }

        return largest;
    }





}
