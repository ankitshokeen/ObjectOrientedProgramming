package Singleton;

public class Singleton {
    Singleton(){

    }

    private static Singleton Instance;

    public static Singleton getInstance(){
        if (Instance==null){
            Instance = new Singleton();
            System.out.println("1 object created");
        }
        return Instance;
    }
}
