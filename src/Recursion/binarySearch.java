package Recursion;

public class binarySearch {
    static void main(String[] args) {
        int[] arr = {2,5,7,9,10};
        System.out.println(BinaryRecursiveSearch(arr,2,0,arr.length-1));
    }

    private static int BinaryRecursiveSearch(int[] arr, int target,int start,int end) {
        if(end<start){
            return -1;
        }

        int mid =start + (end - start) / 2;


        if(arr[mid]>target){
            return BinaryRecursiveSearch(arr,target,start,mid-1);
        }
        else if(target>arr[mid]) {

            return BinaryRecursiveSearch(arr, target, mid + 1, end);
        }

        return mid;

    }


}
