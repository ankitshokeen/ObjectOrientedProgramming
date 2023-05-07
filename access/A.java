package access;

public class A extends Main{
//    private int num; // you cannot access private method out of this class.
    protected int num; // you can only access protected via subclass inside or outside the package or from subclass of subclass
    String name;
    int[] arr;

    public int getNum() { // creating object to access private data type from out this class
        return num;
    }

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
