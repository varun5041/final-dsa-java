package Recursion.Practice;

public class CheckArrayIsSorted {
    static void main(String[] args) {
        int[] arr = {3,2};

        System.out.println(isSorted2(arr));
    }

    private static boolean isSorted(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]) {
                return false;
            }
        }

        return true;
    }

    private static boolean isSorted2(int[] arr){
        int n = arr.length;
        int index= 0;

        return helper(arr,index);
    }

    private static boolean helper(int[] arr, int index) {
        if(index==arr.length-1){
            return true;
        }

        if(arr[index]>arr[index+1]){
            return false;
        }

        return helper(arr,index+1);
    }
}
