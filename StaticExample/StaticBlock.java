package StaticExample;

public class StaticBlock {
    static int a = 4;
    static int b;

    static{
        System.out.println("you are in static block");
        b = 5*a;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);

        b += 8;
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);
    }
}
