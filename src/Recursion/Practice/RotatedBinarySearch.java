package Recursion.Practice;

public class RotatedBinarySearch {
    static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        int end =  arr.length-1;
        System.out.println(helper(arr,9,0,end));
    }

    public static int helper(int[] nums, int target, int start, int end){
        if(start>end){
            return -1;

        }

        int mid = start + (end-start)/2;

        if(nums[mid]==target){
            return mid;
        }

        if (nums[start] <= nums[mid]) {          // left half sorted

            if (target >= nums[start] && target < nums[mid]) {
                return helper(nums, target, start, mid - 1);
            } else {
                return helper(nums, target, mid + 1, end);
            }

        } else {                               // right half sorted

            if (target > nums[mid] && target <= nums[end]) {
                return helper(nums, target, mid + 1, end);
            } else {
                return helper(nums, target, start, mid - 1);
            }

        }
    }
}
