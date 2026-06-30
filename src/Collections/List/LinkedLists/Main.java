package Collections.List.LinkedLists;

import java.util.LinkedList;

public class Main {
    static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        System.out.println(linkedlist);//O(n)
        System.out.println(linkedlist.getFirst()); //O(1)
        System.out.println(linkedlist.get(2)); //O(n)
    }
}
