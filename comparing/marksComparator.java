package comparing;

import java.util.Comparator;

public class marksComparator implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getMarks() - o2.getMarks());
//        return -(int) (o1.getMarks() - o2.getMarks()); // this will sort in decending order
    }


}
