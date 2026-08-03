package BitManipulation.Maths;

import java.util.ArrayList;
import java.util.List;

public class PrintAllDivisors {
    static void main(String[] args) {
        int n = 36;
        System.out.println(GetAllDivisors(n));
    }

    private static List<Integer> GetAllDivisors(int n) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0){
                ans.add(i);
                if(n/i!=i) {
                    ans.add(n / i);
                }
            }
        }

        return ans;
    }
}
