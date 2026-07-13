package Arrayslearn.ArraysLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    static void main(String[] args) {
        int[] digits = {5,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        boolean NewArrayUsed = false;
        int[] temp = null;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] == 9 && i != 0) {
                digits[i] = 0;
            } else if (digits[i] == 9 && i == 0) {
                digits[i]=0;
                temp = new int[n + 1];
                for (int j = 1; j < temp.length; j++) {
                    temp[j] = digits[j - 1];
                }
                temp[0] = 1;
                NewArrayUsed = true;
            } else {
                digits[i] += 1;
                break;
            }
        }


        if (!NewArrayUsed) {
            return digits;
        }

        return temp;
    }
}
