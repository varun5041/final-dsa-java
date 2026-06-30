package Basics;

import java.util.Scanner;

public class continuekeyword {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while(i <=10){

            if(i==3){
                i++;
                continue;

            }

            System.out.println(i);
            i++;
        }
    }
}
