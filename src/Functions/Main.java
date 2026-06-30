package Functions;

public class Main {
    static void main(String[] args){
//        int result= decimaltobinary(7);
//        System.out.println(result);
        System.out.println(counteven(2111));


    }

    public static void swap(int a , int b){
        int temp;
        temp=a;
        a=b;
        b=temp;

        System.out.println(a);
        System.out.println(b);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }

    public static int factorial(int n){ //recursive
        if(n==0 || n==1){
            return 1;
        }
        int fact;

        fact=factorial(n-1)*n;
        return fact;
    }

    public static int binomialcoeff(int k,int r){

        return (factorial(k))/(factorial(r) * factorial(k-r));
    }

    public static void primenumberinrange(int range){
        for(int i = 1;i<=range;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n){
        boolean prime=true;
        if(n==1){
            return false;
        }else if(n==2){
            return true;
        }else{
        for(int i = 2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                prime=false;
            }
        }}

        return prime;
    }

    public static int binarytodecimal(int binary){
        int decimal = 0;
        int lastdigit;
        int count = 0;
        while(binary>0){

            lastdigit=binary%10;
            decimal=(int)(decimal+lastdigit*Math.pow(2,count));
            binary=binary/10;
            count ++;
        }

        return decimal;
    }

    public static int decimaltobinary(int n){
        int count=0;
        int remainder=0;
        int binary=0;
        while(n!=0){
            remainder=n%2;
            binary=binary+remainder*(int)Math.pow(10,count);
            n=n/2;
            count++;
        }
        return binary;
    }

    public static boolean counteven(int num){
        int count=0;
        while (num>0){
            num=num/10;
            count++;
        }

        if(count%2==0){
            return true;
        }
        return false;

    }

}
