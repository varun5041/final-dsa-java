package Arrayslearn.ArraysLeetcode;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOf2arrays {
    static void main(String[] args) {
        int[] arr1 = {1,2,3,3,4,5,6,7};
        int[] arr2 = {1,3,3,7};

        System.out.println(IntersectionOf2(arr1,arr2));
    }
    //bruteForce Approach
    private static List<Integer> IntersectionOf(int[] arr1, int[] arr2) {
        List<Integer> intersection = new ArrayList<>();
        int[] visited = new int[arr2.length];
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j] && visited[j]==0){
                    intersection.add(arr1[i]);
                    visited[j]=1;
                    break;
                }
                if(arr2[j]>arr1[i]){
                    break;
                }
            }
        }
        return intersection;
    }

    //optimal
    private static List<Integer> IntersectionOf2(int[] arr1, int[] arr2) {
        List<Integer> intersection = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                i++;
            } else if (arr1[i]>arr2[j]) {
                j++;
            }else {
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }
        return intersection;
    }
}
