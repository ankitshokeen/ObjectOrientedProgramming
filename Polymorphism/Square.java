package Polymorphism;
import access.A; // importing class from another package
import org.w3c.dom.ls.LSOutput;

public class Square extends Shapes{
    void out(){
        System.out.println("you are in square");
    }

    A obj = new A(12, "ankit");
    //obj.num; can,t getting num value coz num is private
    int n = obj.getNum(); // here we can access coz you will see in the class where private data type is created, there we created another object to refer the private object

}
