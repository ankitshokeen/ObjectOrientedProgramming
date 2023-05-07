package Polymorphism;

public class Main {
    public static void main(String[] args) {

        Shapes shape = new Shapes();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        triangle.out();
        shape.out();
       // System.out.println(triangle.getNum()); // accessing private variable from another class
//        System.out.println(triangle.num2);
    }
}
