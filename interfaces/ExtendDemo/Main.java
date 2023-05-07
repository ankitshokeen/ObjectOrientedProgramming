package interfaces.ExtendDemo;

public class Main implements B{
    @Override
    public void fun() {
        System.out.println("hello fun");
    }

    @Override
    public void greet() {
        System.out.println("good morning");
    }
}
