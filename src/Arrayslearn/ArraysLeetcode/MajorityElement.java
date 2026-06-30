package Arrayslearn.ArraysLeetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    static void main(String[] args) {
        int[] nums= {3,2,3};
        System.out.println(Majority(nums));
    }

    private static int Majority(int[] nums) {
        int ans=0;
        Map<Integer,Integer> map = new HashMap<>();

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }

//        System.out.println(map);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()> n/2){
                ans=entry.getKey();
            }
        }
        return ans;
    }
}
