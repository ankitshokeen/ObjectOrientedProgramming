public class WRAPPERandFINAL {
    public static void main(String[] args) {

        Integer a = 10;
        Integer b = 20;
        Integer num = 40;

        swap(a, b);

        System.out.println(a +" "+ b);


        final A ankit = new A("ankit shokeen");
        ankit.name = "ANKIT SHOKEEN";
        System.out.println(ankit.name);

        //when a non primitive is final you cannot reassign it
        // ankit = new A("hello");
    }
    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;

       A obj = new A("aannkkiitt");
        System.out.println(obj);
//        for (int i=0; i<100000000; i++){
//            obj = new A("object created");
//        }
    }
}

class A{
    final int num = 10;
    String name;

    A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is destroyed");
    }
}