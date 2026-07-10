package Arrayslearn.ArraysLeetcode;

public class ProductSubbarray {
    static void main(String[] args) {
        int[] arr={-1,-2,-3,0};
        System.out.println(maxProduct2(arr));
    }

    //better
    private static int maxProduct(int[] nums) {
        int n = nums.length;
        int maxProd=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = i; j < n; j++) {
                product*=nums[j];

                maxProd=Math.max(maxProd,product);
            }
        }

        return maxProd;
    }

    //optimal
    private static int maxProduct2(int[] nums) {

        int n = nums.length;

        //left to right
        int leftProd=1;
        int LeftMAX=Integer.MIN_VALUE;
        for (int i = 0; i<n; i++) {
            leftProd=leftProd*nums[i];
            LeftMAX=Math.max(LeftMAX,leftProd);
            if (leftProd==0){
                leftProd=1;
            }
        }

        int rightProd=1;
        int rightMAX=Integer.MIN_VALUE;
        for (int i = n-1;i>=0;i--){
            rightProd=rightProd*nums[i];
            rightMAX=Math.max(rightMAX,rightProd);
            if(rightProd==0){
                rightProd=1;
            }
        }

        return Math.max(rightMAX,LeftMAX);


    }



}
