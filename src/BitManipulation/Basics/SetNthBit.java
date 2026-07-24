package BitManipulation.Basics;

public class SetNthBit {
    static void main(String[] args) {


        int num = 13;
        System.out.println(SetnthBit(num,1));
    }

    public static int SetnthBit(int num,int n){
        return num | 1<<n;
    }
}
