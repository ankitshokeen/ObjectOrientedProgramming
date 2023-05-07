package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{

        Human ankit = new Human(22, "ankit");
//        Human other = new Human(ankit);
//        System.out.println(other.age +" "+ other.name);
        Human cloned = (Human) ankit.clone();
//        System.out.println(cloned.age +" "+ cloned.name);

        System.out.println(Arrays.toString(ankit.arr));

        cloned.arr[0] = 500; // for non primitive data type cloning will pointing to same the object

        System.out.println(Arrays.toString(cloned.arr)); // now it will be pointing to the new object the is called deep copying

//        cloned.name = "shokeen"; // for primitive data type cloning will create new object
//        System.out.println(ankit.name);
    }
}
