package Basics;

import java.util.Scanner;

public class primenumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:");
        int n = sc.nextInt();
        boolean result = isPrime(n);
        if(result==true){
            System.out.println("prime");
        }else{
                System.out.println("not prime");
        }
    }

    public static boolean isPrime(int n){
        boolean prime=true;
        if(n<=2){
            return true;
        }
        for(int i = 2;i<Math.sqrt(n);i++){
            if(n%i==0){
                prime=false;
            }
        }
        return prime;
    }
}
