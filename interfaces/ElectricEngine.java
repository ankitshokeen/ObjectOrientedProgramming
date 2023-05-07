package interfaces;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("starting motor");
    }

    @Override
    public void stop() {
        System.out.println("stoping motor");
    }
}
