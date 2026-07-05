package Arrayslearn.ArraysLeetcode;

import java.util.*;

public class foursum {
    static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        System.out.println(fourSum3(arr,0));
    }

    //brute
    private static List<List<Integer>> fourSum(int[] nums,int target) {
        int n =  nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i = 0;i<n-3;i++){
            for (int j = i+1; j < n-2; j++) {
                for (int k = j+1; k < n-1; k++) {
                    for (int l = k+1; l < n; l++) {
                        if(nums[i]+nums[j]+nums[k]+nums[l]==target){
//
                            List<Integer> newAns = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);

                            Collections.sort(newAns);
                            if (!(set.contains(newAns))) {
                                ans.add(newAns);
                                set.add(newAns);
                            }
//
                        }
                    }
                }
            }
        }

        return ans;
    }

    //better
    private static List<List<Integer>> fourSum2(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> ansSet = new HashSet<>();
        for (int i =0;i<n-2;i++){
            for (int j = i+1; j < n-1; j++) {
                Set<Long> set = new HashSet<>();
                for (int k =j+1;k<n;k++){
                    long sum =nums[i]+nums[j];
                    sum+=nums[k];
                    long fourth = ((long)target)-(sum);
                    if(set.contains(fourth)){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],(int)fourth);
                        Collections.sort(temp);
                        if(!ansSet.contains(temp)){
                            ans.add(temp);
                            ansSet.add(temp);
                        }
                    }
                    set.add((long)nums[k]);
                }
            }
        }

        return ans;
    }

    //Optimal
    public static List<List<Integer>> fourSum3(int[] nums,int target){
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0; i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }

            for (int j =i+1;j<n;j++){

                if(j!=i+1 && nums[j]==nums[j-1]){
                    continue;
                }

                int k=j+1;
                int l=n-1;
                while(l>k){
                    //calculate sum
                    long sum=nums[i];
                    sum+=nums[j];
                    sum+=nums[k];
                    sum+=nums[l];
                    //if(sum = target)
                    if(sum==target){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(l>k && nums[k]==nums[k-1]){
                            k++;
                        }
                        while(l>k && nums[l]==nums[l+1]) {
                            l--;
                        }
                    } else if (sum>target) {
                        l--;
                    }else {
                        k++;
                    }
                }
            }
        }

        return ans;
    }

}
