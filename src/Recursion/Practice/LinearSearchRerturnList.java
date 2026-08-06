package Recursion.Practice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LinearSearchRerturnList {
    static void main(String[] args) {
        int[] arr = {2,3,4,5,3,6,3,3};

        System.out.println(RepeatedLinearSearch(arr,3));
    }

    private static List<Integer> RepeatedLinearSearch(int[] arr,int target) {
        int n = arr.length;
        List<Integer> ans = new ArrayList<>();
        int index = 0;
        return Helper(arr,index,target,ans);
    }

    private static List<Integer> Helper(int[] arr,int index,int target, List<Integer> ans) {
        int n = arr.length;
        if(index==n){
            return ans;
        }

        if(arr[index]==target){
            ans.add(index);
            return Helper(arr,index+1,target,ans);
        }


        return Helper(arr,index+1,target,ans);
    }


}
