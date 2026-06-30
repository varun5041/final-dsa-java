package Collections.Map.Hashmap;

import java.util.*;

public class Main {
    static void main(String[] args) {
        HashMap<Integer,String> student = new HashMap<>();
        student.put(1,"Varun");
        student.put(2,"Sahil");
        student.put(3,"Sachin");
        System.out.println(student);
        System.out.println(student.get(1));
        System.out.println(student.containsKey(2));

        for(Integer i:student.keySet() ){
            System.out.println(student.get(i));
        }

        Set<Map.Entry<Integer,String>> entries =student.entrySet();

        for(Map.Entry<Integer,String> i : entries){
            System.out.println(i.getKey() + ":" + i.getValue());
        }

        String s = "Varun";
        System.out.println(s.hashCode()%16);
        String s1 = "Sachin";
        System.out.println(s1.hashCode()%16);
    }
}
