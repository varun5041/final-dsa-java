package Arrayslearn.ArraysLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangle2 {
    static void main(String[] args) {
        System.out.println(getRow2(3));
    }

    private static List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        //[1,]
        for(int i = 1;i<=rowIndex-1;i++){
            int number = getNumber(i,rowIndex);
            ans.add(number);
        }

        if(rowIndex!=0){
            ans.add(1);
        }

        return ans;
    }

    public static int getNumber(int index ,int row){

        if(index  == 1 && row==2){
            return 2;
        }

        if(index==0 || index==row){
            return 1;
        }

        return getNumber(index,row-1)+getNumber(index-1,row-1);
    }

    private static List<Integer> getRow2(int rowIndex) {
        if (rowIndex == 0) {
            return Arrays.asList(1);
        }
        if (rowIndex == 1) {
            return Arrays.asList(1, 1);
        }
        List<Integer> prev = new ArrayList<>();


        for (int i = 2; i <= rowIndex; i++) {
            if(i==2){
                prev=Arrays.asList(1,1);
            }
            List<Integer> current = new ArrayList<>();
            for (int j = 0; j <= i ; j++) {
                if(j==0 || j==i){
                    current.add(1);
                }else {
                    current.add(prev.get(j) + prev.get(j - 1));
                }
            }
            prev=current;
        }

        return prev;
    }


}

