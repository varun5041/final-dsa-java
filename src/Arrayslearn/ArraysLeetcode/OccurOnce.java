package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class OccurOnce {
    static void main(String[] args) {
        int[] arr ={4,1,2,1,2};
        System.out.println(OccurOnceOtherTwice3(arr));
    }


    public static int OccurOnceOtherTwice3(int[] arr){
        int ans = 0;

        for (int num : arr) {
            ans ^= num;
        }

        return ans;
    }
    public static int OccurOnceOtherTwice(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);
        int ans=0;

        for (Map.Entry<Integer,Integer> i: map.entrySet()){
            if(i.getValue()==1){
                ans = i.getKey();
                break;
            }
        }
        return ans;
    }

    //only for positives
    public static int OccurOnceOtherTwice2(int[] arr) {
        int ans=-1;
        int largest = largestInArray(arr);
        int[] hashArray= new int[largest+1];

        for (int i = 0;i<arr.length;i++) {
            int indexToInsert = arr[i];
            hashArray[indexToInsert]+=1;
        }


        for (int i=0;i<hashArray.length;i++){
            if(hashArray[i]==1){
                ans=i;
            }
        }

        return ans;
    }

    private static int largestInArray(int[] arr) {
        int largest=0;
        for (int i :arr){
            if(i>largest){
                largest=i;
            }
        }

        return largest;
    }


}
