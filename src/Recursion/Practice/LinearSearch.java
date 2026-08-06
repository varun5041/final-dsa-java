package Recursion.Practice;


public class LinearSearch {
    static void main(String[] args) {
        int[] arr = {4,9,2,7,6,3};

        System.out.println(Find(arr,4));
    }

    private static int Find(int[] arr, int target) {
        int index = 0;
        return helper(arr,target,index);
    }
    private static int helper(int[] arr, int target ,int index){
        if(index==arr.length){
            return -1;
        }

        if(arr[index]==target)return index;

        return helper(arr,target,index+1);
    }


}
