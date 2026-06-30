package Basics;

import java.util.Scanner;

public class calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();
        System.out.println("enter a operator(+,-,*,/)");
        char operator = sc.next().charAt(0);


        switch (operator){
            case '+' :
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if(b!=0){
                System.out.println(a/b);
                }else{
                    System.out.println("error");
                }
                break;
            default:
                System.out.println("enter valid operator");
        }
    }
}
