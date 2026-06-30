package Arrayslearn.BinarySearchalgo;

public class MountainArr {
    static void main(String[] args) {
        int[] arr={1,2,5,6,3,1};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int ansindex = 0;
        while(end!=start){

            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            } else if (arr[mid]<arr[mid+1]) {
                start=mid+1;
            }
        }

        return start;

    }
}
