package week2.main_task.AllAnimals;

public class Rabbit extends Animal{

    public Rabbit(String name) {
        super(name);
        setSound(" ");
    }

    @Override
    public void eat() {
        setEating(true);
        setSleeping(false);
        System.out.println(getName() + " eat carrots");
    }

    @Override
    public void speak() {
        if (!getSleeping()){
            System.out.println("We hear silence from " + getName());
        }
    }
}
