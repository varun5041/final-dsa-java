package Recursion.Practice;

public class SumOfN {
    static void main(String[] args) {
        int n= 5;
        System.out.println(getSum(5));
    }

    private static int getSum(int n) {
        if(n==1){
            return 1;
        }
        return getSum(n-1)+n;
    }


}
