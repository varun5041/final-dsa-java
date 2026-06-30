package Basics;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        float num1 = sc.nextFloat();
        System.out.println("enter second number");
        float num2 = sc.nextFloat();

        int sum = (int)(num1+num2);
        System.out.println("SUM IS " + sum);
    }
}
