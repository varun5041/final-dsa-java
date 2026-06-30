package Collections.Map.SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    static void main(String[] args) {
        SortedMap<Integer,String> sortedMap = new TreeMap<>(); //it implements NavigationMaps->Sorted map

        sortedMap.put(10,"Varun");
        sortedMap.put(5,"sachin");
        sortedMap.put(2,"chinmay");

        System.out.println(sortedMap); //sorted

        System.out.println(sortedMap.firstKey());

        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap(5));

        System.out.println(sortedMap.tailMap(5));


    }
}
