package interfaces.ExtendDemo2;

public class Main implements B{



    @Override
    public void greet() {
        System.out.println("overridden method");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.greet();

        A.greeting();
    }
}
