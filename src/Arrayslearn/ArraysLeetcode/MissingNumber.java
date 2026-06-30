package Arrayslearn.ArraysLeetcode;

public class MissingNumber {
    static void main(String[] args) {
        int[] arr = {1,2,3,5};
//        System.out.println(Sumof(5));
        System.out.println(MissingNum2(arr));
    }

    private static int MissingNum(int[] arr) {
        int n = arr.length+1;

        for (int i = 1; i<n ;i++){
            boolean isPresent=false;
            for (int j =0;j<arr.length;j++){
                if(arr[j]==i){
                    isPresent=true;
                    break;
                }
            }

            if (!isPresent){
                return i;
            }
        }
        return -1;
    }
    //optimal
    private static int MissingNum2(int[] arr) {
       int n = arr.length+1;
       int actualSum=Sumof(n);
       int ArrSum=0;
       for (int i=0;i<arr.length;i++){
           ArrSum+=arr[i];
       }

       int missingNum=actualSum-ArrSum;

       return missingNum;
    }

    public static int Sumof(int n){
        int sum=0;
        for (int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }





}
