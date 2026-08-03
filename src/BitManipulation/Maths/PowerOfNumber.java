package BitManipulation.Maths;


import java.util.HashMap;
import java.util.Map;

public class PowerOfNumber {
    static void main(String[] args) {
        int x=2;
        int n =4;

        System.out.println(power2(x,n));
    }

    public static double power(double x , int n){
        Map<String,Double> map = new HashMap<>();
        double ans=1;
        if(n>0) {
            ans = getPower(x, n,map);
        }else if(n<0){
            long power=n;
            x=1/x;
            ans=getPower(x,-1* power,map);
        }
        return ans;
    }

    private static double getPower(double x, long n,Map<String,Double> map) {
        if(map.containsKey(x+","+n)){
            return map.get(x+","+n);
        }


        if (n == 0) {
            map.put(x+","+n,(double)1);
            return 1;
        }
        if (n == 1) {
            map.put(x+","+n,x);
            return x;
        }

        if (n % 2 == 0){
            double answer = getPower(x, n / 2,map) * getPower(x, n / 2,map);
            map.put(x+","+n,answer);
            return answer;

        }

        double ans = getPower(x, n - 1,map) * x;
        map.put(x+","+n,ans);
        return ans;
    }


    public static double power2(double x , int n){
        double ans=1.0;
        long nn = n;
        if(nn<0) nn=-1*nn;
        while(nn>0){
            if(nn%2==1){
                ans=ans * x;
                nn=nn-1;
            }else{
                x=x*x;
                nn=nn/2;
            }
        }

        if(n<0) ans = (1.0)/(double)ans;
        return ans;
    }
}
