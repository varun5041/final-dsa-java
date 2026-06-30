package Basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int avg = (a+b+c)/3;

        System.out.println(avg);

        System.out.println("hello world!");
        System.out.println("Enter your name!");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
    }
}
