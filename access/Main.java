package access;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        A a = new A(15, "ankit");
        // need to do few things
        // access the data members
        // modify the daya members

        System.out.println(a.arr.length);

//        ArrayList<Integer> list = new ArrayList<>(20);
//        list.DEFAULT_CAPACITY;

        int n = a.num;
        a.getNum();
    }
}
