package Arrayslearn.ArraysLeetcode;

import java.util.HashMap;
import java.util.Map;

public class SubbarraysXORk {
    static void main(String[] args) {
        int[] arr = {1,1,1,1};

        System.out.println(subarrayXOR2(arr, 0));
    }

    //brute
    private static int subarrayXOR(int[] arr, int k) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int XOR = 0;
            for (int j = i; j < n; j++) {

                XOR = XOR ^ arr[j];

                if (XOR == k) {
                    count++;
                }
            }
        }

        return count;
    }

    //optimal
    private static int subarrayXOR2(int[] arr, int k){

        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int prefixXOR=0;
        int count = 0;
        for (int i = 0;i<n;i++){
            //calculate prefixXOR
            prefixXOR=prefixXOR^arr[i];

            if(map.containsKey(prefixXOR^k)){
                count+=map.get(prefixXOR^k);
            }

            map.put(prefixXOR, map.getOrDefault(prefixXOR,0)+1);
        }

        return count;
    }


}
