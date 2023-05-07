package access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {

        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public static void main(String[] args) {

//        ObjectDemo obj = new ObjectDemo(55);
//        ObjectDemo obj2 = obj;
//
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());

        ObjectDemo obj3 = new ObjectDemo(55, 75.9f);
        ObjectDemo obj4 = new ObjectDemo(55, 75.9f);

        if (obj3 == obj4){
            System.out.println("obj3 is equals to obj4");
        }

        if (obj3.equals(obj4)){
            System.out.println("obj3 is equals to obj4");
        }
    }
}
