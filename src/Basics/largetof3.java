package Basics;

import java.util.Scanner;

public class largetof3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b){
            if(a>c){
                System.out.println("a is lagest");
            }
        } else if (b>c) {
            System.out.println("b is largest");
        }else {
            System.out.println("c is largest");
        }
    }
}
