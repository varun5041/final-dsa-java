package Collections.Map.IdentityHashmaps;

import java.util.IdentityHashMap;

public class Main {
    static void main(String[] args) {
        String key1 = new String("hello");
        String key2 = new String("hello");

        IdentityHashMap<String,Integer> idhm = new IdentityHashMap<>();
        //identity hashmap always used object Class hashcode for differentiating keys
        //ALSO USES == OPERATOR INSTEAD OF .EQUALS
        idhm.put(key1,1);  //different object
        idhm.put(key2,100); //different object
        System.out.println("HASH OF OBJECYT 1:"+System.identityHashCode(key1));
        System.out.println("HASH OF OBJECT 2:"+System.identityHashCode(key2));

        System.out.println("HASH OF OBJECT1 CONTENT"+key1.hashCode());
        System.out.println("HASH OF OBJECT2 CONTENT"+key2.hashCode());
        System.out.println(idhm);
    }
}
