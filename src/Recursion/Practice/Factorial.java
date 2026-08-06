package Recursion.Practice;

public class Factorial {
    static void main(String[] args) {
        System.out.println(getFactorial(10));
    }

    private static int getFactorial(int n) {
        if(n==1){
            return 1;
        }
        return n * getFactorial(n-1);
    }
}
