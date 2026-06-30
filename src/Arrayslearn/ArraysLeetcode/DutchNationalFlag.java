package Arrayslearn.ArraysLeetcode;


import java.util.Arrays;
//2,0,2,1,1,0,1,2,2,1,0,2,0,0,1,2
public class DutchNationalFlag {
    static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0,1,2,2,1,0,2,0,0,1,2};

        System.out.println(Arrays.toString(DutchSort(arr)));
    }

    private static int[] DutchSort(int[] arr) {
        int start = 0;
        int mid = 0;
        int end=arr.length-1;

        while (mid<=end){
            if(arr[mid]==0){
                SwapinArray(arr,start,mid);
                start++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                SwapinArray(arr,mid,end);
                end--;
            }
        }


        return arr;
    }



    public static int[] SwapinArray(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        return arr;
    }
}
