package Recursion.Practice;

public class CountnoOfZerosInNumber {
    static void main(String[] args) {
        int num= 40203;

        System.out.println(countZeros2(num));
    }

    private static int countZeros(int num) {
        int count = 0;

        while(num>0){
            if(num%10==0){
                count++;
            }

            num=num/10;
        }

        return count;
    }

    static int count = 0;
    private static int countZeros2(int num){
        if(num==0) return count;

        if(num%10==0) count++;

        countZeros2(num/10);

        return count;
    }
}
