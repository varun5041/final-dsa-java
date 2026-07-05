package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;

public class FindPivotIndex {
    static void main(String[] args) {
        int[] arr = {2,1,-1};

        System.out.println(FindPivot(arr));
    }

    public static int FindPivot(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        //fill the prefix aray
        int sum=0;
        for (int i=0;i<n;i++){
            sum=sum+nums[i];
            prefix[i]=sum;
        }

        System.out.println(Arrays.toString(prefix));
        for(int i =0;i<n;i++){
            int leftsum=0;
            int rightsum=0;
            if(i==0){
                leftsum=0;
                rightsum=prefix[n-1]-prefix[i];
            } else if (i==n-1) {
                rightsum=0;
                leftsum=prefix[i-1];
            }else {
                leftsum = prefix[i - 1];
                rightsum = prefix[n - 1] - prefix[i];
            }
            if(leftsum==rightsum){
                return i;
            }
        }
        return -1;
    }
}
