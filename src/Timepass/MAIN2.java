package Timepass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MAIN2 {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverse(arr,0,2)));
    }

    public static int[] reverse(int[] arr,int start,int end){
        while(start!=end){
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
