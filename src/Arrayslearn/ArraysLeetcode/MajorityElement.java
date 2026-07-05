package Arrayslearn.ArraysLeetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    static void main(String[] args) {
        int[] nums= {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
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

    //optimal : Moore's Voting ALgorithm
    private static int Majority2(int[] nums){
        int n = nums.length;
        int majorityElement=-1;
        int count=0;
        for (int i =0;i<n;i++){
            if(count==0){
                majorityElement=nums[i];

            } else if (nums[i]==majorityElement) {
                count++;
            }else {
                count--;
            }
        }

        int counter =0;
        for (int i = 0; i<n;i++){
            if(nums[i]==majorityElement){
                counter++;
            }
        }

        if(counter>n/2){
            return majorityElement;
        }

        return -1;
    }
}
