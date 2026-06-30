package Basics;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        float num = sc.nextInt(); //implicit casting
//        int num2 = (int)sc.nextFloat(); //explicit casting
//
//        int num3 = (int)(10.23f); //casting explicitly
//        float a = (float)10.5;//double to float

//        byte b = 127;
//        b++;
//        System.out.println(b);
//        b++;
//        System.out.println(b);
//        b++;
//        System.out.println(b);
//        for(int i=1;i<500;i++){
//            b++;
//            System.out.println(b);
//        }

//         int a = 'A'; //65
//        System.out.println(a);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);
    //        double > float> int > short > char > byte
    }
}
