package abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("i want to be doctor");
    }

    @Override
    void intrest() {
        System.out.println("i love shopping");
    }
}
