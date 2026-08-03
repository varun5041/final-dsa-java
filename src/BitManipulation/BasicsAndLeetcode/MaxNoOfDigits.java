package BitManipulation.BasicsAndLeetcode;

public class MaxNoOfDigits {
    static void main(String[] args) {
        int n = 16;

        System.out.println(MaxDigits(n));
    }

    private static int MaxDigits(int n) {
        return (int)(Math.log(n)/Math.log(2))+1;
    }
}
