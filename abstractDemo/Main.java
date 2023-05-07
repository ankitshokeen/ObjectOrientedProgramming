package abstractDemo;

public class Main {
    public static void main(String[] args) {

        Son son = new Son(22);
        Daughter daughter = new Daughter(20);

        son.career();
        daughter.intrest();

        System.out.println(son.age);
        System.out.println(daughter.yob);
    }
}
