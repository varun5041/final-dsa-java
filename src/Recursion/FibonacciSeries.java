package Recursion;

public class FibonacciSeries
{
    static void main(String[] args) {
        int n = 5;
        System.out.println(Fibonacci(n));;
    }

    private static int Fibonacci(int n) {
        if(n==1) return 1;
        if(n==0) return 0;

        int ans =  Fibonacci(n-1)+Fibonacci(n-2);

        return ans;
    }


}
