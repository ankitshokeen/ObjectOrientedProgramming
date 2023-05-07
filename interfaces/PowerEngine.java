package interfaces;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("starts like power engine");
    }

    @Override
    public void stop() {
        System.out.println("stops like power engine");
    }
}
