package Arrayslearn.ArraysLeetcode;

public class MaxConsecutiveOnes {
    static void main(String[] args) {
        int[] arr= {1,1,0,1,1,1,9};
        System.out.println(MaxConsOnes(arr));
    }

    private static int MaxConsOnes(int[] arr) {
        int n = arr.length;
        int MaxAns=0;
        int count =0;
        for (int i = 0; i < n; i++) {

            if(arr[i]==1){
                count++;
                if(count>MaxAns){
                    MaxAns=count;
                }
            }else{
                count=0;
            }
        }

        return MaxAns;
    }
}
