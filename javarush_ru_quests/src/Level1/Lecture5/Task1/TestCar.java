package javarush.quests.Level1.Lecture5.Task1;

public class TestCar {
    public static void main(String[] args) {
        Car car = new Car();
        Car.Engine engine = car.new Engine();

        engine.start();
        engine.stop();
    }
}
