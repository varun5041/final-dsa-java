package Recursion.Practice;

public class PrintReverse {
    static void main(String[] args) {
        int n = 1534236469;
        System.out.println(reverse(n));;
    }

//    private static void PrintReverseofnumber(int n) {
//        if(n==0){
//            return;
//        }
//
//        System.out.print(n%10);
//        PrintReverseofnumber(n/10);
//    }
    static long sum = 0;
//    private static int PrintReverseofnumber2(int n) {
//        if(n==0){
//            return (int)sum;
//        }
//        int rem = n%10;
//        sum = sum * 10 +rem;
//        return PrintReverseofnumber2(n/10);
//
//    }

    private static int reverse(int x) {
        boolean isNegative = (long)x<0;
        if(x<=Integer.MIN_VALUE || x>=Integer.MAX_VALUE){
             return 0;
        }
        if(isNegative){
            x=-x;
        }
        if(x==0){
            return 0;
        }

        int power = (int)Math.log10(x)+1;
        int rem = x%10;
        sum = getSum(rem,power-1);
        long ans = (long)sum + reverse(x / 10);
        if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE){
            return 0;
        }
        return isNegative ? (int)-ans : (int)ans;

    }

    static long getSum(int rem,int power){
        return rem * (long)Math.pow(10,power);
    }

}
