public class OOPintro {
    public static void main(String[] args) {

        // creating array to store roll no of every student
        int[] rNO = new int[5];
        // array for student names
        String[] name = new String[5];
        // array to store marks
        float[] marks = new float[5];

        Student[] students = new Student[5];
        //System.out.println(Arrays.toString(students));

        //Student ankit; // just declaring not initializing
        //System.out.println(ankit);

        Student ankit = new Student(05, "ankit", 88.55f);
        Student kunal = new Student(20, "kunal", 99.22f);
        //ankit.rNO = 10;
        //ankit.name = "ankit shokeen";
        //ankit.marks = 78.5f;

        //System.out.println(ankit.rNO);
        //System.out.println(ankit.name);
        //System.out.println(ankit.marks);

        //System.out.println(kunal.rNO);
        //System.out.println(kunal.name);
        //System.out.println(kunal.marks);

        //ankit.changeName("spiritual");
        //kunal.changeName("wemakedevs");

        //ankit.greet();
        //kunal.greet();

        Student random = new Student(ankit);
        //System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;
        one.name = "something something";
        System.out.println(two.name);


    }
}
class Student{
    int rNO;
    String name;
    float marks;

    //we need a way to add values in every above properties abject by object
    //we need that one word to access every object
    //this keyword will give same value to every object, because below constructor has none perameters, and none perameters in object

    void greet(){
        System.out.println("hello my name is " + this.name);
    }
    void changeName(String newName){
        name = newName;
    }
    Student(){
        //this is how you call a constructor from another constructor
        // internally is some thing like this : Student (9, "default", 99.9f);
        this (9, "default", 99.9f);
    }

    Student(int roll, String naam, float mark){
        this.rNO = roll;
        this.name = naam;
        this.marks = mark;
    }

    Student(Student other){
        this.rNO = other.rNO;
        this.name = other.name;
        this.marks = other.marks;
    }
}
