package Arrayslearn.ArraysLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class MissingAndRepeating {
    static void main(String[] args) {
        int[] arr = {2,6,3,4,4,1};

//        System.out.println(FindMissingAndRepeating(arr));
        System.out.println(FindMissingAndRepeating3(arr));
    }

    //bruteForce Solution
    private static ArrayList<Integer> FindMissingAndRepeating(int[] arr) {
        int n = arr.length;
        int missingNo=-1;
        int repeatingNo=-1;
        for (int i = 1; i <= n; i++) {
            int count=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==i){
                    count++;
                }
            }
            if(count==2){
                repeatingNo=i;
            }

            if(count==0){
                missingNo=i;
            }
        }
        return new ArrayList<>(Arrays.asList(repeatingNo,missingNo));

    }

    //better Solution
    private static ArrayList<Integer> FindMissingAndRepeating2(int[] arr){
        int n = arr.length;
        int[] count = new int[n+1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]+=1;
        }

//        System.out.println(Arrays.toString(count));
        int missingNo=-1;
        int repeatingNo=-1;
        for (int i =1;i<count.length;i++){
            if(count[i]==0){
                missingNo=i;
            }
            if(count[i]==2){
                repeatingNo=i;
            }
            if(repeatingNo!=-1 && missingNo!=-1){
                break;
            }
        }
        return new ArrayList<>(Arrays.asList(repeatingNo,missingNo));
    }

    //Optimal Solution
    public static ArrayList<Integer> FindMissingAndRepeating3(int[] arr){
        int n = arr.length;
        //sum of no till n
        long Sn = (((long) (n) *(n+1))/2);
        //sum of squares till n
        long Sn2 = ((long)n * (n+1) * (2L *n+1) )/ 6;

        long Sa = 0;
        long Sa2 = 0;

        //calculating sum of squares of numbers and sums of all no in array
        for (int i = 0; i < n; i++) {
            Sa+=arr[i];
            Sa2+= (long)arr[i]*(long)arr[i];
        }

        long val1 = Sa-Sn;
        long val2 = Sa2-Sn2;
        val2 = val2/val1;

        long repeatingNo = (val1+val2)/2;
        long missingNo = repeatingNo - val1;

        return new ArrayList<>(Arrays.asList((int)repeatingNo,(int)missingNo));
    }
}
