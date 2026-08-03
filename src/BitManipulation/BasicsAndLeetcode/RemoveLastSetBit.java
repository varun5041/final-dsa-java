package BitManipulation.BasicsAndLeetcode;

public class RemoveLastSetBit {
    static void main(String[] args) {
        int num = 50;

        System.out.println(RemovelastSet(num));
    }

    public static int RemovelastSet(int num){
        return num&num-1;
    }
}
