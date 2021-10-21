package week2.main_task.AllAnimals;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        setEating(true);
        setSleeping(false);
        System.out.println(getName() + " gnaw a big bone");
    }

    @Override
    public void speak() {
        if (!getSleeping()){
            System.out.println(getName() + " says Bow-Bow");
        }
    }
}

