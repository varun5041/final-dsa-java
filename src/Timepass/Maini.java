package Timepass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Maini {
    static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(arr));
    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0;
        for(int j=0;j<n;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        System.out.println(Arrays.toString(nums));

        return i+1;
    }
}
