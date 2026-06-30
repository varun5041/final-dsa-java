package Patterns;

import java.util.Scanner;

public class pattenr7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows");
        int n = sc.nextInt();
        int count =n;
        for(int i = 1;i<=n;i++){

            for(int j = 1;j<=count;j++){
                System.out.print(j);
            }
            count--;

            System.out.println();
        }
    }
}
