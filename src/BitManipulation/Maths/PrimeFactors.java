package BitManipulation.Maths;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    static void main(String[] args) {
        int n =  780;

//        System.out.println(isPrime(n));
        PrimeFactors(n);
        System.out.println(PrimeFactors2(n));
    }

    //factors?if num1 is divisible by num2
    //num2 is a factors of num1
    //num1%num2==0
    public static void PrimeFactors(int n){
        for (int i = 2; i <= n; i++) {
            if(n%i==0){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
        }

    }

    public static List<Integer> PrimeFactors2(int n){
        List<Integer> ans = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                ans.add(i);

                //keep dividing the number until it is divisible by that number
                while (n%i==0){
                    n=n/i;
                }
            }

        }

        if(n!=1){
            ans.add(n);
        }
        return ans;
    }


    public static boolean isPrime(int n){
        for (int i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n%i==0){
                return false;
            }
        } return true;
    }


}
