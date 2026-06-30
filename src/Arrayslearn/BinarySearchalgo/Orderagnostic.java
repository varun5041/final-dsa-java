package Arrayslearn.BinarySearchalgo;

public class Orderagnostic {
    static void main(String[] args) {
        int arr[]= {9,8,7,6,5,4,3,2,1};

        System.out.println(OrderAgnosticBinarySearch(arr,3));

    }

    public static int OrderAgnosticBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];


        while(end>=start){

            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                return mid; //target found
            }else if(isAsc){
                if(target>arr[mid]){
                    start=mid+1; //right side search space
                }else{
                    end=mid-1;    //left side search space
                }
            }else {
                if(target<arr[mid]){
                    start=mid+1; //right side search space
                }else{
                    end=mid-1;    //left side search space
                }

            }
        }

        return -1;

    }
}
