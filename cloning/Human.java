package cloning;

import java.util.Arrays;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{5, 6, 7, 8};
    }

//    public Human(Human other){
//        this.age = other.age;
//        this.name = other.name;
//    }

//    public Object clone() throws CloneNotSupportedException {
//        this is shallow copy
//        return super.clone();
//    }

    public Object clone() throws CloneNotSupportedException{
//        this is deep copying
        Human twin = (Human)super.clone();
        twin.arr = new int[this.arr.length];

        for (int i=0; i<this.arr.length; i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
