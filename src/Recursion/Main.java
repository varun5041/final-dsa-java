package Recursion;

public class Main {
    static void main(String[] args) {
        int value=10;
        Print(1);
    }

    private static void Print(int n) {

            System.out.println(n);
        if(n<10) {
            Print(n + 1);
        }
    }

}
