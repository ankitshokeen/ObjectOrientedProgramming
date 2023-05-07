package comparing;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<=5; i++){
            list.add(i * 5);
        }

//        list.forEach((item) -> System.out.println(item));

        Consumer<Integer> fun = (item) -> System.out.println(item);
        list.forEach(fun);

        Operation sum = (a, b) -> (a+b);
        Operation sub = (a, b) -> (a-b);
        Operation prod = (a, b) -> (a*b);

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(5,5, sum));
        System.out.println(myCalculator.operate(5,5, sub));
        System.out.println(myCalculator.operate(5,5, prod));
    }

    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
    interface Operation{

        int operation(int a, int b);
    }
}
