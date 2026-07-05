package Arrayslearn.ArraysLeetcode;

import java.util.HashMap;
import java.util.Map;

public class MaxLengthSubbarrayEqualsZero {
    static void main(String[] args) {
        int[] arr = {15,-2,2,-8,1,7,10,23};

        System.out.println(maxLength(arr));
    }

    private static int maxLength(int[] arr) {

        int n = arr.length;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int prefixSum=0;
        int MaxLength=0;
        int target=0;
        for(int i =0;i<n;i++){
            int length = 0;
            prefixSum+=arr[i];
            if(map.containsKey(prefixSum-target)){
                length = i-map.get(prefixSum-target);
                MaxLength=Math.max(MaxLength,length);
            }else{
            map.put(prefixSum,i);
            }
        }

        return MaxLength;
    }


}
