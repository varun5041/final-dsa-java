package Arrayslearn.ArraysLeetcode;

import Basics.Largestof2;

import java.util.Arrays;

public class TrappingRainwater {
    static void main(String[] args) {
        int[] arr={4,2,0,3,2,5};

        System.out.println(CalcRainwater(arr));
    }

    private static int CalcRainwater(int[] height) {
        int n = height.length;
        int[] leftMax= new int[n];
        int[] rightMax= new int[n];
        //Calculating leftMax For each Element
        for (int i=1;i<n;i++){
            leftMax[0]=height[0];
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        for (int i=n-2;i>=0;i--) {
            rightMax[n - 1] = height[n - 1];
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        System.out.println(Arrays.toString(leftMax));
        System.out.println(Arrays.toString(rightMax));

        int AnsWater=0;
        for (int i=0;i<n;i++){
            int WaterAbove=0;
            int leftmax=leftMax[i];
            int rightmax=rightMax[i];
            int Minimum = Math.min(leftmax,rightmax);
            WaterAbove=Minimum-height[i];
            AnsWater+=WaterAbove;
        }
        return AnsWater;


    }


}
