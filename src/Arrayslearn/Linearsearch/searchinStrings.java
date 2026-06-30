package Arrayslearn.Linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class searchinStrings {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name="Varun";
        char target='a';
        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(search(name,target));
    }

    public static boolean search(String str,char target){
        if(str.isEmpty()){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return true;
    }
}
