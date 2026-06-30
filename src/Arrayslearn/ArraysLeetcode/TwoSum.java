package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static void main(String[] args) {
        int arr[] = {2,7,11,15};

        System.out.println(Arrays.toString(twoSum(arr,9)));
    }

    //better approach
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            int requiredNo = target-nums[i];

            if(map.containsKey(requiredNo)){
                return new int[]{map.get(requiredNo),i};
            }else{
                map.put(nums[i],i);
            }
        }

        return new int[]{-1,-1};

    }

    //optimal approach sorted two sum class here since the array is  not sorted this is a good approach
}
