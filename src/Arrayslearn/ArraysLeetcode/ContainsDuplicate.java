package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    static void main(String[] args) {
        int[] arr={1,2,};

        System.out.println(containsDuplicate2(arr));
    }

    private static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet() ){
            if(entry.getValue()>1){
                return true;
            }
        }
        return false;
    }

    private static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int j = i+1;
            int currentNo = nums[i];
            while(j<n){
                if(j==i){
                    j++;
                }else {
                    if(nums[j]==currentNo){
                        return true;
                    }
                    j++;
                }
            }
        }

        return false;

    }

    private static boolean containsDuplicate3(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        for (int i =0;i<n;i++){
            if(i<n && nums[i+1]==nums[i]){
                return true;
            }
        }

        return false;

    }
}
