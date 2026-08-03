package BitManipulation.BasicsAndLeetcode;

public class CountSetBits {
    static void main(String[] args) {
        int n = 15;

        System.out.println(CountSet(n));
    }

    private static int CountSet(int n) {
        int count = 0;
        for (int i = 0;i<32;i++){
            if((n>>i&1)==1){
                count++;
            }
        }

        return count;
    }

    //optimal
    private static int CountSet2(int n) {
        int count = 0;
        for (int i = 0;i<32;i++){
            if((n>>i&1)==1){
                count++;
            }
        }

        return count;
    }
}
