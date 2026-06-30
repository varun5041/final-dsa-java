package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;

public class RotateKtimes {
    static void main(String[] args) {
        int arr [] ={1,2,3,4,5,6,7};
//        LeftRotatebyK2(arr,3);
        System.out.println(Arrays.toString(LeftRotatebyK3(arr,4)));
    }
////rotate array by one k times
//    private static int[] LeftRotatebyK(int[] nums, int k) {
//        k= k% nums.length;
//        k=k+1;
//        for (int i = 1; i <= k; i++) {
//            int temp = nums[nums.length-1];
//            for (int j = nums.length-2; j >= 0; j--) {
//                nums[j+1]=nums[j];
//            }
//            nums[0]=temp;
//        }
//
//        return nums;
//    }
//
//    private static int[] LeftRotatebyK2(int[] nums,int k){
//        int n = nums.length;
//        k = k % n;
//
//        int[] temp = new int[k];
//        int index =0;
//        for (int i= n-k;i<n;i++){  //O(k)
//            temp[index]=nums[i];
//            index++;
//        }
//
//
//        //shifting
//        for (int i = n-k-1; i >= 0 ; i--) { //O(n-k)
//            nums[i+k]=nums[i];
//        }
//        //inserting temp
//        for (int i = 0; i < temp.length; i++) { //O(k)
//            nums[i]=temp[i];
//        }
//        return nums;
//    }

    private static int[] LeftRotatebyK3(int[] nums,int k){
        int n = nums.length;
        k=k%n;
        reverse(nums,n-k,n-1);
        reverse(nums,0,(n-k-1));

        reverse(nums,0,n-1);
        return nums;
    }

    public static int[] reverse(int[] arr,int start,int end){
        while(end>start){
            //swap
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
}
