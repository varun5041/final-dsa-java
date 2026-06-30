package Basics;

import java.util.Scanner;

public class sumofnumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int  n = sc.nextInt();
        int sum =0;
        int counter=1;

        while(counter<=n){
            sum+=counter;
            counter++;
        }
        System.out.println("sum is:" + sum);
    }
}
