package StringsAndStringBuilder.Theory;

public class Main {
    static void main(String[] args) {
        String a = "Varun";
        System.out.println(a);
        a="Soni";
        System.out.println(a);
        a=a+a;
        System.out.println(a);

        /// checking//////////////////
        String name1 = "Varun";
        String name2 = "Varun";
        String name3="Soni";
        System.out.println(name1==name2);
        System.out.println(name1==name3);

        /// /////how to create different objects ///////////////
        String x = new String("Kunal");
        String y = new String("Kunal");

        System.out.println(x.equals(y));//true //checks value
        System.out.println(x==y); //false
        /// ////////////
        /// /////////////
        String b= null;
        System.out.println(b);

    }
}
