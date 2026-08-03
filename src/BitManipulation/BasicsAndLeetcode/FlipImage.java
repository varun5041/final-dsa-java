package BitManipulation.BasicsAndLeetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FlipImage {
    static void main(String[] args) {
        int[][] arr = {
                {1,1,0},
                {0,1,1},
                {1,0,1}
        };

        System.out.println(Arrays.deepToString(flipthis(arr)));
    }

    private static int[][] flipthis(int[][] image) {
        int n = image.length;

        for(int[] row : image){
            reverse(row);
        }

        return image;

    }

    public static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(end>=start){
            //swap;
            int temp=arr[start]^1;
            arr[start]=arr[end]^1;
            arr[end]=temp;

            start++;
            end--;
        }


        return arr;
    }
}
