package Basics;

import java.util.Scanner;



public class celciustofarheniet {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter temp in celcius");
        float tempc = sc.nextFloat();
        System.out.println("tempreature in farheniet");
        float tempf = tempc * 9/5 + 32;
        System.out.println(tempf);
    }
}
