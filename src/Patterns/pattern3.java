package Patterns;

import java.util.Scanner;

public class pattern3 {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=i;j++);{
                int j=1;
                while(j<=i){
                    System.out.print(j);
                    j++;
                }
            }
            System.out.println();
        }
    }
}
