package Collections.List.ArrayListclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);

        list.add(2);

        list.add(3);
        list.add(4);
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
//        System.out.println(list.get(0));
//        System.out.println(list.get(1));
//        System.out.println(list.get(2));
//
//        for (Integer i : list){
//            System.out.println(i);
//        }

//        System.out.println(list.size());
//        System.out.println(list.contains(2));

//        list.remove(2);
//        System.out.println(list);
//        list.set(2,100); //replace hota hai
//        System.out.println(list);
//        list.add(2,50); //khiska derta hai aur add hota hai
//        System.out.println(list);
//        System.out.println(list.);


    }
}
