package BitManipulation.Basics;
public class Powerof2 {
    static void main(String[] args) {


        int num = 4;

        System.out.println(isPowerOfTwo(num));
    }


    public static boolean isPowerOfTwo(int n){
        int count=0;
        while(n!=0){
            n=n&n-1;
            count++;
            if(count>1){
                return false;
            }
        }

        return true;
    }
}
