package Recursion.Practice;

public class PrintNto1 {
    static void main(String[] args) {
        both(5);
    }

    static void printnumsReverse(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        printnumsReverse(n-1);
    }

    static void printonetoN(int n){
        if(n==0){
            return;
        }
        printonetoN(n-1);
        System.out.println(n);
    }

    static void both(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        both(n-1);
        System.out.println(n);
    }
}
