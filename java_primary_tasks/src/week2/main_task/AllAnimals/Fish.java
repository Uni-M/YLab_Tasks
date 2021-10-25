package week2.main_task.AllAnimals;

public class Fish extends Animal{

    String sound = " ";

    @Override
    public void eat() {
        setEating(true);
        setSleeping(false);
    }

    @Override
    public void speak() {
        if (!getSleeping()){
            System.out.println(sound);
        }
    }
}

