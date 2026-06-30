package Basics;

import java.util.Scanner;

public class inputuntil {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("start entering numbers:");
       while(true){
           int n = sc.nextInt();

           if(n%10==0){
               break;
           }
           System.out.println(n);
       }
    }
}
