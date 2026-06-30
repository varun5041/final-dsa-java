package Arrayslearn.ArraysLeetcode;

public class IsArraySorted {
    static void main(String[] args) {
        int arr[]={};
        System.out.println(IsSorted(arr));
    }

    public static boolean IsSorted(int arr[]){
        boolean sorted=true;
        for (int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                sorted=true;
            }else {
                sorted=false;
                break;
            }
        }
        return sorted;
    }
}
