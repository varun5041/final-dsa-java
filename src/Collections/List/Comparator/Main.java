package Collections.List.Comparator;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(10);

//        list.sort();
//        System.out.println(list);


        ArrayList<String> list1 = new ArrayList<>();

        list1.add("date");
        list1.add("apple");
        list1.add("banana");
//
//        System.out.println(list1);
//        list1.sort(null);
//        System.out.println(list1);
        System.out.println("Descending sort using comparator");
//        list.sort(new DescendingComparator());
        System.out.println(list);

        System.out.println("sort string with comparator based on length of String");
//        list1.sort(new StringLengthComparator());
        System.out.println(list1);
        //can also used lambda expressions
        list1.sort((a,b)->b.length()-a.length());


        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Varun",8.8));
        students.add(new Student("Sahil",8.9));
        students.add(new Student("Sachin",8.8));
        students.add(new Student("Chinmay",9.5));
        //  Varun Sahil
         // 8.7    8.9

        /// //////method 1 //////////////////////////////////////
//        students.sort((s1,s2)->{
//            if(s2.getGpa()-s1.getGpa()>0){
//                return 1;
//            } else if (s2.getGpa()-s1.getGpa()<0) {
//                return -1;
//            }else{
//                return 0;
//            }
//        });
//        System.out.println(students);

        /// ///////////////////Method 2///////////////////////////
        Comparator<Student> gpaDescending = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(gpaDescending);
        System.out.println(students);
    }




}

//class DescendingComparator implements Comparator<Integer>{
//
//    public int compare(Integer num1, Integer num2) {
//        // +ve return ->num2 ,num1
//        // -ve return ->num1 , num2
//        return num2 - num1; //return -ve
//        //trick //palatne ke liye +ve return //same num1 num 2 rakhne ke liye -ve return
//        //3 5        /5 3
//    }
//
//
//
//
//
//}


class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();  //descending
    }

//    ok   bye
}
