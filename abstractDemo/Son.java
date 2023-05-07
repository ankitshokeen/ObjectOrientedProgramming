package abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("i want to be a programmer");
    }

    @Override
    void intrest() {
        System.out.println("money management");
    }
}
