package BitManipulation.Basics;

public class AllRepeatedtwiceExceptOne {
    static void main(String[] args) {
        int[] arr = {2,4,6,4,2,6,1};
        System.out.println(FindNumber(arr));
    }



    public static int FindNumber(int[] arr){
        int n = arr.length;
        int XOR= 0;
        for (int i = 0; i < n; i++) {
            XOR=XOR^arr[i];
        }

        return XOR;
    }
}


