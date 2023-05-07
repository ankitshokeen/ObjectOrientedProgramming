package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        List list = new ArrayList();
        List list2 = new LinkedList();

        for (int i = 0; i < 8; i++) {
            list2.add(i * 2);
        }

        System.out.println(list2);

        List list3 = new Vector();

        for (int i = 0; i < 10; i++) {
            list3.add(i);
        }

        System.out.println(list3);
    }
}
