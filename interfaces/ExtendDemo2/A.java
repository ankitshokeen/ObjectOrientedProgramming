package interfaces.ExtendDemo2;

public interface A {
    default void fun(){
        System.out.println("this is default method");
    }

    public static void greeting(){
        System.out.println("hello world!");
    }
}
