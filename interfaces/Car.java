package interfaces;

public class Car implements Engine, Brake, Media{
//    static int a = 50;

    @Override
    public void brake() {
        System.out.println("i stop like normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like normal engine");
    }

    @Override
    public void stop() {
        System.out.println("i stop like normal engine");
    }
}
