package BitManipulation.Basics;

public class EvenOddChecker {
    static void main(String[] args) {
        System.out.println(isEven(9));
    }

    public static boolean isEven(int num){
        if((num & 1)==1){
            return false;
        }

        return true;
    }
}
