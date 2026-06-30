package Arrayslearn.ArraysLeetcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SprialArrayPrint {
    static void main(String[] args) {
        int[][] arr= {
//                {1, 2, 3, 4, 5,  6}
//                {20,21,22,23,24, 7},
//                {19,32,33,34,25, 8},
//                {18,31,36,35,26, 9},
//                {17,30,29,28,27,10},
//                {16,15,14,13,12,11}

                {1},
                {5},
                {6},
                {8},
                {10}
        };

        System.out.println(Arrays.deepToString(arr));

        System.out.println(spiralOrder(arr));
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left=0;
        int top=0;
        int right=n-1;
        int bottom = m-1;

        while (right>=left && top<=bottom){
            //add left to right
            for (int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            //add from top to bottom
            for (int i = top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;

            //add from right to left
            if(top<=bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //add from bottom to top
            if(left<=right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;


    }


}
