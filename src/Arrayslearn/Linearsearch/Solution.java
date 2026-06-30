package Arrayslearn.Linearsearch;

public class Solution {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};

        System.out.println(findNumbers(arr));


    }

    public static int findNumbers(int[] nums){
        int AnsCount=0;

        for (int i = 0; i < nums.length; i++) {
            if(counteven(nums[i])){
                AnsCount++;
            }

        }

        return AnsCount;
    }

    public static boolean counteven(int num){
        int count=0;
        while (num>0){
            num=num/10;
            count++;
        }

        if(count%2==0){
            return true;
        }
        return false;

    }
}
