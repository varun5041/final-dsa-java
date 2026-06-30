package Arrayslearn.ArraysLeetcode;

import java.util.*;

public class UnionOfArrays {
    static void main(String[] args) {
        int[] arr1 = {1};
        int[] arr2 = {1,2,3};
        System.out.println(UnionArrays2(arr1,arr2));
    }

    public static int[] UnionArrays(int[] arr1,int[] arr2){
        Set<Integer> set = new LinkedHashSet<>();

        for (int i : arr1){
            set.add(i);
        }

        for (int i : arr2){
            set.add(i);
        }

        int[] UnionArray= new int[set.size()];
        int index=0;
        for (Integer i : set){
            UnionArray[index]=i;
            index++;
        }

        return UnionArray;
    }

    public static List<Integer> UnionArrays2(int[] arr1, int[] arr2){
        List<Integer> Union = new ArrayList<>();
        int i=0;
        int j=0;
        int n1 = arr1.length;
        int n2 = arr2.length;

        while(i<n1 && j<n2){

            if(arr1[i] < arr2[j]){
                if(!Union.contains(arr1[i])){
                    Union.add(arr1[i]);
                }

                i++;
            }else if (arr1[i] > arr2[j]){
                if (!Union.contains(arr2[j])) {
                    Union.add(arr2[j]);
                }
                j++;
            }
            else{
                if(!Union.contains(arr1[i])){
                    Union.add(arr1[i]);
                    i++;
                    j++;
                }

            }
        }

        while(j<n2){
            if(!Union.contains(arr2[j])){
                Union.add(arr2[j]);
            }
            j++;
        }

        while(i<n1){
            if(!Union.contains(arr1[i])){
                Union.add(arr1[i]);
            }
            i++;
        }

        return Union;
    }

}
