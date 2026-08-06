package Recursion.Practice;

public class SumofDigits {
    static void main(String[] args) {
        int n = 1342222;
        System.out.println(getSumOfDigits(n));
    }

    private static int getSumOfDigits(int n) {
        if(n==0){
            return 0;
        }
        return getSumOfDigits(n/10)+n%10;
    }
}
