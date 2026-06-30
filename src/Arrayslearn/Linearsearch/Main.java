package Arrayslearn.Linearsearch;

public class Main {
    static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        System.out.println(searchinrange(arr,5,0,10));
        System.out.println(lineaarsearch(arr,5));

        System.out.println(min(arr));
    }

    public static int lineaarsearch(int[] arr,int target) {
        if(arr.length==0){
            return -1;
        }

        for(int i=0;i<arr.length;i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int searchinrange(int[] arr,int target,int start,int end) {
        if(arr.length==0){
            return -1;
        }

        for(int i=start;i<end;i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int min(int[] arr){
        int smallest =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< smallest){
                smallest =arr[i];
            }
        }

        return smallest;
    }


}
