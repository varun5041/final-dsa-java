package BitManipulation.BasicsAndLeetcode;

public class Power {
    static void main(String[] args) {
        int x = 2;
        int n = 100;

        System.out.println(Mypow(x,n));
    }

    private static int Mypow(int x, int n) {
        long power = (long)n;
        long ans = 1;
        long base  = (long)x;
        while (power>0){
            if((power&1)!=0){
                ans=ans*base;
            }
            power=power>>1;
            base=base*base;
        }

        return (int)ans;
    }
}
