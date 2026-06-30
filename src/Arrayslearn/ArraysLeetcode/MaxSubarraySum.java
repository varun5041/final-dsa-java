package Arrayslearn.ArraysLeetcode;

import java.util.HashMap;
import java.util.Map;

public class MaxSubarraySum {
    static void main(String[] args) {
        int[] arr={5,1,3};
        System.out.println(maximumSubarraySum(arr,1));
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        long maxsum = 0;
        int left = 0;
        int right = 0;
        long sum = nums[right];

        map.put(nums[right], 1);

        if (nums.length == 1 && k == 1) {
            return sum;
        }

        boolean isDuplicates = false;

        while (right < k - 1) {
            right++;
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            sum += nums[right];
        }

        isDuplicates = (map.size() != k);

        if (!isDuplicates) {
            maxsum = Math.max(maxsum, sum);
        }

        while (right < n - 1) {
            right++;
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            left++;
            map.put(nums[left - 1], map.getOrDefault(nums[left - 1], 0) - 1);

            if (map.get(nums[left - 1]) == 0) {
                map.remove(nums[left - 1]);
            }

            sum = sum + nums[right] - nums[left - 1];

            isDuplicates = (map.size() != k);

            if (!isDuplicates) {
                maxsum = Math.max(maxsum, sum);
            }
        }

        return maxsum;
    }
}
