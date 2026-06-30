package Arrayslearn.ArraysLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeros {
    static void main(String[] args) {
        int[][] arr={
//                {0,1,2,0},
//                {3,4,5,2},
//                {1,3,1,5},
//

                {1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}

        };

//        System.out.println(Arrays.deepToString(arr));
//        System.out.println(SetZero(arr));

        SetZero2(arr);
    }


    //my approach
    private static List<List<Integer>> SetZero(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0;i<m;i++){
            ans.add(new ArrayList<>());
            for(int j =0;j<n;j++){
                ans.get(i).add(j,matrix[i][j]);
            }
        }
        for(int i = 0;i<m;i++){
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]==0){
                    //i th row all elements(COLUMNS) set 0
                    for(int col = 0 ;col<n;col++){
//                        ans[i][col]=0;
                        ans.get(i).set(col,0);
                    }

                    //jth column all elements set 0
                    for(int row =0;row<m;row++){
//                        ans[row][j]=0;
                        ans.get(row).set(j,0);
                    }
                }else{
                    if(ans.get(i).get(j)!=0){
                        ans.get(i).set(j,matrix[i][j]);
                    }
                }
            }
        }

//        System.out.println(ans);

        return ans;
    }

    public static void SetZero2(int[][] matrix) {
        int m = matrix.length; //no of rows
        int n = matrix[0].length; //no of col
        //create a row and a col array equal to size n and m respectively
        int[] row = new int[m];
        int[] col = new int[n];

        //iterate in the entire matrix
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        System.out.println(Arrays.toString(row));
        System.out.println(Arrays.toString(col));

        //reiterate the matrix and if the Particular row or column matrix elements is 1 set the elemenrts to 0
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }

        System.out.println(Arrays.deepToString(matrix));

    }

}


