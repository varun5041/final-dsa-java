package BitManipulation.BasicsAndLeetcode;

public class SumOfNthRowInPascalsTriangle {
    static void main(String[] args) {
    int n = 5;
    System.out.println(GetSumOfNthRow(n));
    }

    private static int GetSumOfNthRow(int n) {
        return 1<<n-1;
    }
}