package javarush.quests.Level1.Lecture4.Task3;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setModelName("Niva");
        car1.setSpeed(50);

        car2.setModelName("Honda");
        car2.setSpeed(100);

        car3.setModelName("Mini");
        car3.setSpeed(90);

        System.out.println("Car #1 model is: " + car1.getModelName() + ", speed: " + car1.getSpeed());
        System.out.println("Car #2 model is: " + car2.getModelName() + ", speed: " + car2.getSpeed());
        System.out.println("Car #3 model is: " + car3.getModelName() + ", speed: " + car3.getSpeed());
    }
}
