package Arrayslearn.BinarySearchalgo;

public class MinimumInRotatedSortedArray {
    static void main(String[] args) {
        int[] arr= {5,1,2,3,4};

        System.out.println(findMin(arr));
    }


    public static int findMin(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }

        int start = 0;
        int end = nums.length-1;

        if(nums[start]<nums[end]){
            return nums[start];
        }

        while(end>start){


            int mid = start + (end-start)/2;
            if(nums[mid]<nums[mid+1]){
                if(nums[start]<nums[mid]){
                    start = mid +1;
                }else{
                    end = mid;
                }
            }else{
                return nums[mid+1];
            }
        }

        return nums[0];
        }

}
