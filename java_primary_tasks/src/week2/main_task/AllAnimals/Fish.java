package week2.main_task.AllAnimals;

public class Fish extends Animal{

    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        setEating(true);
        setSleeping(false);
        System.out.println(getName() + " eat little worms");
    }

    @Override
    public void speak() {
        if (!getSleeping()){
            System.out.println("We hear silence from " + getName());
        }
    }
}

