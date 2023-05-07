package comparing;

public class Student implements Comparable<Student>{
    private int rNo;
    private String name;
    private float marks;

    public Student(int rNo, String name, float marks) {
        this.rNo = rNo;
        this.name = name;
        this.marks = marks;
    }

    public int getrNo() {
        return rNo;
    }

    public void setrNo(int rNo) {
        this.rNo = rNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rNo=" + rNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return this.rNo -o. rNo;
    }
}
