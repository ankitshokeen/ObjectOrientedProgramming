package access;

public class SubSubClass extends SubClass{

    public SubSubClass(int num, String name) {
        super(num, name);
    }

    SubSubClass ssb = new SubSubClass(65, "ankit");
    int n = ssb.num;
}
