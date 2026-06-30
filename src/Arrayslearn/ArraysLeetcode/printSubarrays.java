package Arrayslearn.ArraysLeetcode;

public class printSubarrays {
    static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,3,2,2,1,2,1};

        printSubarrays(arr);
    }

    public static void printSubarrays(int[] arr) {
        int n = arr.length;
        int MaxSum=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j=i;j<n;j++){
                int sum=0;
                System.out.print("[");
                for (int k =i;k<=j;k++){
                    System.out.print(arr[k]+ " ");
                    sum=sum+arr[k];
                }
                System.out.print("]");
                System.out.println("SUM = " + sum);
                MaxSum=Math.max(MaxSum,sum);
                System.out.println();
            }

        }

        System.out.println("Max Sum is :"+ MaxSum);
    }



}
