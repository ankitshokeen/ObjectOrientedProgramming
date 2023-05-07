package comparing;

import jdk.dynalink.linker.ConversionComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> student = new ArrayList<>();
        student.add(new Student(7, "ankit", 66.52f));
        student.add(new Student(25, "mohit", 76.52f));
        student.add(new Student(12, "kunal", 92.89f));
        student.add(new Student(7, "gaurav", 98.01f));

//        System.out.println(student);
//        Collections.sort(student); // comparable
//        System.out.println(student);

        ArrayList<Student> student2 = new ArrayList<>(student);
        System.out.println(student);
        Collections.sort(student2, new marksComparator());
//        Collections.sort(student2, (o1, o2) -> (int) (o1.getMarks() - o2.getMarks())); // converted into lambda


        System.out.println(student2);

    }
}
