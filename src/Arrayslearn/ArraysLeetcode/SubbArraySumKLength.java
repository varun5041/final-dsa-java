package Arrayslearn.ArraysLeetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class SubbArraySumKLength {
    static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,3,3};
//        System.out.println(MaxKsumlength2(arr,3));
        MaxKsumlength4(arr,6);
    }


    //bruteForce Solution
    private static int MaxKsumlength(int[] arr, int s)
    {

        int n = arr.length;
        int Maxlength=0;

        for (int i=0;i<n;i++)
        {

            for (int j=i;j<n;j++)
            {
                int sum=0;
                for (int k =i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==s){
                    Maxlength=Math.max(Maxlength,(j-i)+1);
                }
            }
        }
        return Maxlength;
    }

    //optimal if the array contains only positive then we can also stop thj once sum becomes greater than s
    private static int MaxKsumlength2(int[] arr, int s){

        int n = arr.length;
        int Maxlength=0;

        for (int i=0;i<n;i++)
        {
            int sum =0;
            for (int j=i;j<n;j++)
            {
                sum += arr[j];
                if(sum==s) {
                    Maxlength = Math.max(Maxlength, (j - i) + 1);
                }
            }
        }
        return Maxlength;
    }

    private static void MaxKsumlength3(int[] arr, int s){
        int n = arr.length;
        Map<Integer,Integer> prefix= new HashMap<>();
        int sum=0;
        int Maxlength=0;
        for(int i = 0;i<n ;i++){
            sum=sum+arr[i];
            if(sum==s){
                Maxlength=Math.max(Maxlength,i+1);
            }

            if(prefix.containsKey(sum-s)){
                Maxlength=Math.max(Maxlength,i-prefix.get(sum-s));
            }

            if(!prefix.containsKey(sum)){
                prefix.put(sum,i);
            }
        }
        System.out.println(Maxlength);
    }

    //sliding window optimal solution
    private static int MaxKsumlength4(int[] arr, int k) {

        int left = 0;
        int sum = 0;
        int maxLength = 0;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }


}
