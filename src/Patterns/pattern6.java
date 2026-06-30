package Patterns;

import java.util.Scanner;

public class pattern6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows:");
        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            //spaces
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for stars
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
