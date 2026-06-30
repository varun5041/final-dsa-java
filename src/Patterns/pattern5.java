package Patterns;

import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter rows:");
        int r= sc.nextInt();
        System.out.println("enter columns:");
        int c=sc.nextInt();

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || j==1 || i==r || j==c ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
