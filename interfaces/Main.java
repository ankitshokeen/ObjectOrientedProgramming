package interfaces;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car();
//        int n = Car.a;

//        car.start();

//        car.brake();
//        car.stop();

//        Engine music = new Car();
//        music.stop();

        NiceCar car = new NiceCar();
        car.start();
        car.startMusic();
        car.upgradeEngine(); // changing engine
        car.start();
    }
}
