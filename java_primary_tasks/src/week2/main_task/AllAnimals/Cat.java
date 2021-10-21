package week2.main_task.AllAnimals;


public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        setEating(true);
        setSleeping(false);
        System.out.println(getName() + " is eating cat`s food");
    }

    @Override
    public void speak() {
        if (!getSleeping()){
            System.out.println(getName() + " says Mew-Mew");
        }
    }
}

