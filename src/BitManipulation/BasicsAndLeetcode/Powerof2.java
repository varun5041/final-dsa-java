package BitManipulation.BasicsAndLeetcode;
public class Powerof2 {
    static void main(String[] args) {


        int num = 16;

        System.out.println(isPowerOfTwo(num));
    }


    public static boolean isPowerOfTwo(int n){
        if((n&n-1)==0){
            return true;
        }

        return false;
    }
}
