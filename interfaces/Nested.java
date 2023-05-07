package interfaces;

public class Nested {
    public interface A{
        boolean isOdd(int num);
    }
}

class B implements Nested.A{
    @Override
    public boolean isOdd(int num) {
        if (num%2==1) return true;
        return false;
    }
}

class Nmain{
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.isOdd(22));
    }
}
