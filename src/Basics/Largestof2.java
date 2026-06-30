package Basics;

import java.util.Scanner;

public class Largestof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a is largest");
        }else{
            System.out.println("b is largest");
        }
    }
}
