package Arrayslearn.ArraysLeetcode;

public class CountInversiuons {
    static void main(String[] args) {
        int[] arr = {10,8,9,3,5};
        System.out.println(inversionCount(arr));
    }

    private static int inversionCount(int[] arr) {
        int n = arr.length;
        int count =0;
        for (int i = 0; i < n; i++) {

            for(int j = 0 ; j<n;j++){
                if(i==j){
                    continue;
                }
                if(arr[j]<arr[i]){
                    count++;
                }
            }
        }

        return count;
    }
}
