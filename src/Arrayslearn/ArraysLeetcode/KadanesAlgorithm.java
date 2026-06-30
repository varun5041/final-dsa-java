package Arrayslearn.ArraysLeetcode;
public class KadanesAlgorithm {
    static void main(String[] args) {
        int[] arr =  {5,4,-1,7,8};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
            int n = nums.length;
            if(n==1){
                return nums[0];
            }
            int Maxsum=Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int sum=0;
                for (int j=i;j < n;j++){
                    sum+=nums[j];
                    Maxsum = Math.max(Maxsum, sum);
                    if(sum<0) {
                        sum=0;
                    }
                }
            }
            return Maxsum;
    }
}