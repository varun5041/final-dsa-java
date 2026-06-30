package Collections.Comparablesss;
import Collections.Comparablesss.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Bob",8.5));
        list.add(new Student("Sahil",8.9));
        list.add(new Student("Sachin",6.9));
        list.add(new Student("Varun",9.5));

        list.sort(null);  //natural ordering or ideal ordering by gpa(BYdefaultOrderiung)
        System.out.println(list); //natural ordering or ideal ordering
        list.sort(new StudentNameComparator()); // if we want some  type like name ordeering

    }


}
