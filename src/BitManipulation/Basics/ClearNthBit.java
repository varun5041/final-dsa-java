package BitManipulation.Basics;

public class ClearNthBit {
    static void main(String[] args) {
        int num = 13;
        System.out.println(Clear(num,2));
    }

    public static int Clear(int num,int n){
        return num & ~(1 << n);
    }
}
