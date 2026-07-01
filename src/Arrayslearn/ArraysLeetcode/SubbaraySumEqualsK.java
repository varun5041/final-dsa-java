package Arrayslearn.ArraysLeetcode;

import java.util.HashMap;
import java.util.Map;

public class SubbaraySumEqualsK {
    static void main(String[] args) {
        int[] arr = {3,-3,1,1,1};
        System.out.println(subarraySum2(arr,3));
    }

    private static int subarraySum(int[] nums,int k) {
        int n = nums.length;
        int count =0;
        for (int i=0;i<n;i++){
            int sum=0;
            for (int j =i;j<n;j++){
                sum+=nums[j];
                if(sum==k){
                    count++;
                }
            }

        }

        return count;
    }

    //optimal : HashMap + PrefixSum
    public static int subarraySum2(int[] nums,int k) {
        int n = nums.length;
        Map<Integer,Integer> map =new HashMap<>();

        int prefixSum=0;
        int count=0;
        map.put(prefixSum, map.getOrDefault(prefixSum,0)+1);
        for(int i = 0;i<n;i++){
            prefixSum+=nums[i];

            if(map.containsKey(prefixSum-k)){
                count += map.get(prefixSum - k);
                    map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
            }else {
                    map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
            }
        }

        return count;
    }
}
