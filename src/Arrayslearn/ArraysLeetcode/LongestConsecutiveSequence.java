package Arrayslearn.ArraysLeetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    static void main(String[] args) {
        int[] arr= {20,50,102,4,100,101,3,2,103,104};
        System.out.println(getLongestConsecutiveLength(arr));
    }

    public static int getLongestConsecutiveLength(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            set.add(i);
        }
        System.out.println(set);
        int MaxLength=1;
        for (int i : set){
            if(!set.contains(i-1)){
                int nextElement=i+1;
                int length =1;
                while(set.contains(nextElement)){
                    length++;
                    nextElement+=1;
                }
                MaxLength=Math.max(MaxLength, length);
            }
        }


        return MaxLength;
    }
}
