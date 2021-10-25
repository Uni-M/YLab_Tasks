package week2.main_task.AllAnimals;

public class Dog extends Animal{

    @Override
    public void eat() {
        setEating(true);
        setSleeping(false);
    }

    @Override
    public void speak() {
        if (!getSleeping()){
            System.out.println("Bow-bow");
        }
    }
}

