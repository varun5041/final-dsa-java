package BitManipulation.Basics;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

public class GenerateSubsets {
    static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(GetSubsets(arr));
    }

    private static List<List<Integer>> GetSubsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans  = new ArrayList<>();

        for (int i = 0 ; i < (1<<n);i++){
            List<Integer> temp = new ArrayList<>();

            for (int j = 0 ; j < n ;j++){
                if(checkSetBit(i,j)){
                    temp.add(nums[j]);
                }
            }

            ans.add(temp);
        }


        return ans;
    }

    private static boolean checkSetBit(int num, int n) {
        if((num & (1<<n))!=0){
            return true;
        }

        return false;
    }


}
