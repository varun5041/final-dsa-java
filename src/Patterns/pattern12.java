package Patterns;

import java.util.Scanner;

public class pattern12 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            if(i==1 || i==n){
                for(int k=1;k<=n;k++){
                    System.out.print("*");
                }
            }else{
                System.out.print("*");
                for(int a=1;a<n-2;a++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
