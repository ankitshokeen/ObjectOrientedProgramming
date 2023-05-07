package ExceptionHandling;

public class Main {
    public static void main(String[] args) throws CustomException {

        int a = 5;
        int b = 0;

        String name = "ankit";

        if (name.equals("ankit")){
            throw new CustomException("my name is ankit");
        }

        try {
//            divide(a, b);
            throw new ArithmeticException ("just for fun");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }  catch (Exception e){ // catch will tell why it is throwing exception
            System.out.println("normal exception");
//        System.out.println(e.getMessage());
    }
        finally {
            System.out.println("this will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("please do not divide by zero");
        }
        return (a/b);
    }
}