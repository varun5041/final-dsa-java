public class CheckNthBit {
    static void main(String[] args) {
        int num = 13;

        System.out.println(checNthBit2(num,2));
    }

    public static boolean checNthBit(int num,int n){
        return (num & 1<<n)!=0;
    }

    public static boolean checNthBit2(int num,int n){
        return ((num>>n)&1)!=0;
    }

}


