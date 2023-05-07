package enumExample;

public class Main{


    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
//        by default public, static, final
//        type are enum constants
//        you cant create child coz of final
//        type is Week

        @Override
        public void fun() {
            System.out.println("hello you are in fun");
        }

//        Week() {
//            System.out.println("cunstuctor is called for " +" "+ this);
//        }

//        this is not public or protected, only private or default
//        why? we dont want to create new objects
//        this is not the enum concept thats why

//        internally: this works like Week Monday = new Week();
    }

    public static void main(String[] args) {

        Week week;
//        week = Week.Monday;
        week = Week.Thursday;

//        for (Week day : Week.values()){
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal());

//        System.out.println(Week.valueOf("Monday"));

        week.fun();
    }
}
