package Basics;

import java.util.Scanner;

public class printnumbers
{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit");
        int limit = sc.nextInt();
        int counter=1;
        while(counter<=limit){
            System.out.println(counter);
            counter++;
        }
    }
}
