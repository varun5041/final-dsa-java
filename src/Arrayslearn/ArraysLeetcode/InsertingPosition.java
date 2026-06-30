package Arrayslearn.ArraysLeetcode;

public class InsertingPosition {
    static void main(String[] args) {
     int[] arr = {1,3,5,6};
     System.out.println(searchInsert(arr,7));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            } else if (nums[mid]>target) {
                end=mid-1;
            }else {
                end=mid-1;
            }
        }
        return start;
    }
}
