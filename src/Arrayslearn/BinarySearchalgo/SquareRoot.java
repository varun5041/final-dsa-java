package Arrayslearn.BinarySearchalgo;

public class SquareRoot {
    static void main(String[] args) {
        int ans = mySqrt(8);
        System.out.println(ans);
    }

    public static int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        long target = x;
        long start = 1;
        long end = x-1;

        while(end>=start){
            long mid = start + (long)(end-start)/2;
            long product =(long)mid*mid;
            if(product==target){
                return (int)mid;
            }else if(product>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }

        return (int)end;
    }
}
