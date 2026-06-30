package Collections.Hashtablesss;

import java.util.Hashtable;

public class Main {
    static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();

        //it is thread safe
        //all methods are synchronised

        hashtable.put(1,"apple");
        hashtable.put(5,"banana");
        hashtable.put(3,"Mango");

        System.out.println(hashtable.get(5));

        System.out.println(hashtable);
        //   hashtable.put(null,"helowld"); //key cannot be null as well as valuye cannot be null


    }
}
