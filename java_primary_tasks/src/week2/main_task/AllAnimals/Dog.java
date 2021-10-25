package week2.main_task.AllAnimals;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
        setSound("Bow-Bow");
    }

    @Override
    public void eat() {
        setEating(true);
        setSleeping(false);
    }

    @Override
    public void speak() {
        if (!getSleeping()){
            System.out.println(getSound());
        }
    }
}

