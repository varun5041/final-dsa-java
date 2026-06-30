package Collections.Map.LinkedHashMaps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {
    private int capacity;

    public LRUCache(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        if(size()>capacity){
            return true; //true hone pe remove karta hai lRU Element
        }
        return false;
    }


    static void main(String[] args) {
        LRUCache<Integer,String> studentMap =  new LRUCache<>(4);

        studentMap.put(1,"Varun");
        studentMap.put(2,"sahil");
        studentMap.put(3,"Chinmay");
        studentMap.put(4,"sachin");

        System.out.println(studentMap);
        studentMap.get(1);
        System.out.println(studentMap);
        studentMap.get(2);
        System.out.println(studentMap);
        studentMap.get(3);
        System.out.println(studentMap);
        studentMap.put(5,"chimkandi");
        System.out.println(studentMap);

    }
}
