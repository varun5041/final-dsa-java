package Arrayslearn.Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistinjava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(5);

        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);

        System.out.println(list);

        ArrayList<ArrayList<Integer>> mylist = new ArrayList<>();

        //initialize
        for (int i = 0 ;i<3 ;i++){
            mylist.add(new ArrayList<>());
        }

        for(int i = 0;i<3;i++){
            for(int j = 0; j<3;j++){
                mylist.get(i).add(sc.nextInt());
            }
        }

        System.out.println(mylist);
    }
}
