package Polymorphism;

public class Numbers {
     double sum(double a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
         return a+b+c;
    }

    public static void main(String[] args) {
         Numbers obj = new Numbers();

        System.out.println(obj.sum(5, 8));
        System.out.println(obj.sum(5,3,8));
    }
}
