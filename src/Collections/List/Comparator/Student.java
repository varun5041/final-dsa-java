package Collections.List.Comparator;

import java.util.Comparator;
class Student{
    String Name;
    double gpa;

    public Student(String name, double gpa) {
        Name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return Name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
