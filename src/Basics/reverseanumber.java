package Basics;

import java.util.Scanner;

public class reverseanumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number more than one digit:");
        int num = sc.nextInt();
        while(num!=0) {
            int lastdigit = num % 10;
            System.out.print(lastdigit);
            num = num / 10;

        }
    }
}
