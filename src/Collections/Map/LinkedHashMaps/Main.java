package Collections.Map.LinkedHashMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    static void main(String[] args) {
//        HashMap<Integer,String> map = new HashMap<>();
//
//        map.put(622,"varun");
//        map.put(7,"Soham");
//        map.put(90,"aryan");
//        map.put(1,"jeet");
//
//        Set<Map.Entry<Integer,String>> entry  = map.entrySet();
//
//        for (Map.Entry<Integer,String> i : entry){
//            System.out.println(i.getKey()+ " : "+ i.getValue());
//        }
//
//        System.out.println(map);

//
        LinkedHashMap<Integer,String> shoppingList = new LinkedHashMap<>(11,0.3f,true);
        //MAINTAINS ORDER FOR INSERTION
        shoppingList.put(30,"Potato");
        shoppingList.put(500,"Cabbage");
        shoppingList.put(100,"Bread");  
        System.out.println(shoppingList);
        System.out.println(shoppingList.get(500));
        System.out.println(shoppingList.get(30));
        System.out.println(shoppingList.get(500));
        System.out.println(shoppingList);


        HashMap<String,Integer> students = new HashMap<>();
        students.put("shubham",92);
        students.put("sahil",80);
        students.put("varun",58);

        Integer result= students.getOrDefault("vedu",-1);
        System.out.println(result);

        students.putIfAbsent("shubham",90);
        System.out.println(students);


    }
}
