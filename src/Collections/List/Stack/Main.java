package Collections.List.Stack;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println("removed: "+stack.pop());
        System.out.println(stack);
        System.out.println("top of stack: "+ stack.peek() );

        stack.push(50);
        stack.push(21);
        stack.push(31);
        System.out.println(stack);
        System.out.println("index of 2 from top of the stack: " + stack.search(2));


        //Linked List as stack

        LinkedList<Integer> stack2 = new LinkedList<>();
        stack2.addLast(1);//push
        stack2.addLast(2);
        stack2.addLast(3);
        stack2.addLast(4);
        System.out.println(stack2);
        System.out.println(stack2.getLast()); //peek
        System.out.println("removed element top(pop) "+stack2.removeLast()); //pop
        System.out.println(stack2);
    }
}
