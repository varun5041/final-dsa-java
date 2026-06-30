package Arrayslearn.BinarySearchalgo;

public class floor {
    static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,17,18};

        System.out.println(Ceiling(arr,1));
    }

    public static int Ceiling(int[] arr, int target) {

        if(target < arr[0]){
            return -1; // ceiling doesn't exist
        }
        int start = 0;
        int end = arr.length-1;
//        int greaterans=-1;
        while(end>=start){

            int mid=start+(end-start)/2;
//            if(arr[mid]>target){
//                greaterans=mid;
//            }
            if(arr[mid]==target){
                return arr[mid];
            } else if (arr[mid]<target) {
                start=mid+1;
            }else{

                end=mid-1;
            }
        }

        return arr[end];
    }
}
