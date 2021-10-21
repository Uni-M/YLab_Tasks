package javarush.quests.Level1.Lecture4.Task3;

//  Одинаковые машины
//  Требования:
//        •	Поле modelName класса Car должно быть не статическим.
//        •	Должны быть исправлены геттер и сеттер для поля modelName.

public class Car {
    private String modelName;
    private int speed;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
