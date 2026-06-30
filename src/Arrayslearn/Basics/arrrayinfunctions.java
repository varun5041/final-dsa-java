package Arrayslearn.Basics;

import java.util.Arrays;

public class arrrayinfunctions {
    public static void main() {

        int[] nums ={2, 3, 4, 5, 6};

        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums)); //mutability




    }

    public static void change(int[] arr){
        arr[0]=99;
    }
}
