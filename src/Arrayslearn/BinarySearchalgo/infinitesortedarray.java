package Arrayslearn.BinarySearchalgo;

import java.util.Arrays;

public class infinitesortedarray {
    public static void main(String[] args) {
//        int[] arr2=new int[500];
//
//        for(int i = 0;i< arr2.length;i++){
//            arr2[i]=2*i;
//        }
//
//        System.out.println(Arrays.toString(arr2));
//        System.out.println(infinitesearch(arr2,19));
                 // s  e
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
//                   0 1 2 3 4 5 6  7   8  9 10 11

        System.out.println(infinitesearch(arr,10));
    }

    public static int infinitesearch(int[] arr,int target){
        int start=0;
        int end=1;

        while(arr[end]<target){
            int newStart=end+1;
            int temp = newStart;
            end=end+(end-start+1)*2;
            start=temp;
        }

        int index= inbs(arr,target,start,end);
        return index;
    }

    private static int inbs(int[] arr, int target, int start, int end) {
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
