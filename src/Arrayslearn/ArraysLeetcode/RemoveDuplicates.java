package Arrayslearn.ArraysLeetcode;

import java.util.*;

public class RemoveDuplicates {
    static void main(String[] args) {
            int[] nums = {0,0,0,1,1,1,1,2,2,3,3};
        System.out.println(removeDuplicates3(nums));
    }
//
//    public static int removeDuplicates1(int[] nums) {
//        int i=0;
//        int j=0;
//        int count=0;
//        int size = nums.length;
//            while(i<size) {
//                int unique = nums[i];
//                count++;
//                if(i!= size -1|| j!=size-1) {
//                    j = i + 1;
//                }else {
//                    return count;
//                }
//                while (nums[j] == unique && j!=nums.length) {
//                   if(j!= size-1){
//                       deleteAndShift(nums,j);
//                       size--;
//                   }else {
//                       return count;
//                   }
//                }
//                if (nums[j] != unique) {
//                    i = j;
//                }
//            }
//
//
//            return count;
//    }
//
//    public static void deleteAndShift(int[] arr, int index) {
//
//        if (index < 0 || index >= arr.length) {
//            return;
//        }
//
//        for (int i = index; i < arr.length - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
//
//        arr[arr.length-1]=0;
//    }
//
//    public static int removeDuplicates2(int[] nums){
//        Set<Integer>  hashSet= new LinkedHashSet<>();
//        for(int i : nums){
//            hashSet.add(i);
//        }
//        System.out.println(hashSet);
//        int index=0;
//        for (int i : hashSet){
//            nums[index]=i;
//            index++;
//        }
//
//        return index;
//    }

    public static int removeDuplicates3(int[] nums){
        int i=0;
        int j=i+1;
        while (j<nums.length){

            if(nums[i]==nums[j]){
                j++;
            }else {
                i++;
                nums[i]=nums[j];
            }
        }

        return i+1;
    }


}
