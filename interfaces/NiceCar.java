package interfaces;

public class NiceCar {

    private Engine engine = new PowerEngine();
    private Media music = new CDplayer();

    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        music.start();
    }
    public void stopMusic(){
        music.stop();
    }

    public void upgradeEngine(){
        engine = new ElectricEngine();
    }
}