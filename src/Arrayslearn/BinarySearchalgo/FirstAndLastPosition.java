package Arrayslearn.BinarySearchalgo;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        //           0 1 2 3 4 5 6 7 8
        int[] arr = {7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(arr,7)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        ans[0] =occurenceSearch(nums,target,true);
        ans[1] =occurenceSearch(nums,target,false); //gives upperbound
        return ans;
    }
//
    //another function it will return the index of the target of first and last occurence both
    public static int occurenceSearch(int nums[],int target,boolean lowerbound){
        int answer=-1;
        int start = 0;
        int end = nums.length-1;
        while(end>=start){

            int mid = start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;//left side search space
            }else if(target>nums[mid]){
                start=mid+1;   //right side search space
            }else{
                answer=mid;
                if(lowerbound){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return answer;
    }


}
