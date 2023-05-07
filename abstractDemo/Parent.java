package abstractDemo;

public abstract class Parent {
    int age;
    final int yob;

    public Parent(int age) {
        this.age = age;
        this.yob = 2001;
    }

    abstract void career();
    abstract void intrest();



}
