package Collections.List.VectorsJava;

import java.util.Arrays;
import java.util.Vector;

public class Main {
    static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,10);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(2);
        System.out.println(vector.capacity());

        System.out.println(vector);

        Vector<Integer> vector2 = new Vector<>(Arrays.asList(1,2,3,4,5));
        System.out.println(vector2);
        vector2.add(1);
        System.out.println(vector2);

    }
}
