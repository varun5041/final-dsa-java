package Arrayslearn.ArraysLeetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    static void main(String[] args) {
     int[] arr={10,22,13,3,0,6};

     System.out.println(LeadersOf2(arr));

    }

    private static List<Integer> LeadersOf(int[] arr) {
        List<Integer> Leaders = new ArrayList<>();
        int n = arr.length;
        Leaders.add(arr[n-1]);
        int largest =Integer.MIN_VALUE;
        for(int i =0;i<n-1;i++){
            boolean isLeader=false;
            for (int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    isLeader=false;
                    break;
                }else{
                    isLeader=true;
                }
            }
            if(isLeader==true) {
                Leaders.add(arr[i]);
            }
        }

        Leaders.sort(null);
        Collections.reverse(Leaders);
        return Leaders;
    }

    //optimal
    private static List<Integer> LeadersOf2(int[] arr) {
        List<Integer> Leaders = new ArrayList<>();

        int n = arr.length;
        int Greatest=Integer.MIN_VALUE;
        for (int i=n-1;i>=0;i--){
            boolean isLeader=false;
            if(arr[i]>Greatest){
                isLeader=true;
                Greatest=arr[i];
            }
            if(isLeader){
                Leaders.add(arr[i]);
            }
        }

        Leaders.sort(null);
        Collections.reverse(Leaders);
        return Leaders;
    }


}
