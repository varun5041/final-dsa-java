package Arrayslearn.Linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class searchin2DArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr={
                {1,2,3},
                {4,3,1,8,16},
                {3,5}
        };

        System.out.println(Arrays.toString(searchin2Darray(arr,3)));



    }

    public static int[] searchin2Darray(int[][] arr,int target){

        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
