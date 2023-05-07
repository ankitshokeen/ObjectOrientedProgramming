package StaticExample;

public class Main {
    public static void main(String[] args) {

        Human ankit = new Human(22, "ankit shokeen", 15000);
        Human kunal = new Human(22, "kunal", 20000);
        Human arpit = new Human(34, "arpit", 22000);

//        System.out.println(ankit.salary);
//        System.out.println(kunal.age);
//        System.out.println(Human.population);

        //greeting(); //we cannot call non static function into static function because it belongs to an object and it requires an instance
        //but the function you are using it in not depends on instance
        //fun(); //static variable

        Main funn = new Main();
        funn.fun2();
    }

    static void fun(){ //static variable is not belongs to any object
        System.out.println("hello static function"); //but function we are using it in does not dependent on instances
        //greeting(); //here you see non static function cannot be called in static

        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }
    void greeting(){ //we know non static thing is belongs to an object
        System.out.println("good evening");
        //fun(); //but static thing can be called from any where
    }
}