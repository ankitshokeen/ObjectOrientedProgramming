package Inheritance;
import Polymorphism.Triangle;
public class Main extends Triangle{
    public static void main(String[] args) {
//        Box box1 = new Box();
//        //System.out.println(box1.l +" "+ box1.h +" "+ box1.w);
//
//        Box box2 = new Box(5);
//        //System.out.println(box2.l +" "+ box2.h +" "+ box2.w);
//
//        Box box3 = new Box(box1);
//        //System.out.println(box3.h);
//
//        BoxWeight box4 = new BoxWeight();
//        //System.out.println(box4.weight);
//
//        BoxWeight box5 = new BoxWeight(2, 3, 4, 8);
//        //System.out.println(box5.l +" "+ box5.h +" "+ box5.w +" "+ box5.weight);
//
//        Box box6 = new BoxWeight(2,3,4,8);
//        System.out.println(box6.h);
//
//        //there are many variables in both parent and child class
//        //your are given access to variables that are in the refrence type i.e. boxweight
//        //hence you should have access to the weight variable
//        //that is also means you should have to initialize the variable that you want to access
//        //but here when the object itself is of parent class, how will you call the cunstuctor
//        //this is why it showing error
//        BoxWeight box7 = new Box(2,3,4);
//
        BoxPrice box7 = new BoxPrice(2,3,4,8,99);
        System.out.println(box7.price);
    }
}
