package BitManipulation.Basics;

public class Divide2Numbers {
    static void main(String[] args) {
        int dividend = 4;
        int divisor = 2;

        System.out.println(DivideNumbers2(dividend,divisor));
    }

    //worst approach
    public static int DivideNumbers(int dividend , int divisor){
        int sum = 0;
        int count = 0;

        while (sum+divisor<dividend){
            sum+=divisor;
            count++;
        }

        return count;
    }


    //Better Approach
    public static int DivideNumbers2(int dividend , int divisor){
        boolean sign = true;

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if(dividend>=0 && divisor<0) sign=false;
        if(dividend<0 && divisor>0) sign=false;

        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        long ans=0;

        while(n>=d){
            int count = 0;
            long largest = 0;
            while(d*(1L<<count)<=n){
                largest=d*(1L <<count);
                count++;
            }
            count--;
            n-=d*(1L<<count);
            ans+=(1L<<count);
        }

        return sign ? (int)ans : (int)(ans*-1);
    }


}
