package BitManipulation.Basics;

public class XorOfANumber {
    static void main(String[] args) {
        int n = 12;

        System.out.println(XorFromOneToN(n));
    }

    public static int XorFromOneToN(int n){
        if(n%4==0){
            return n;
        }else if(n%4==3){
            return 0;
        } else if (n%4==2) {
            return n+1;
        }

        return 1;
    }

}
