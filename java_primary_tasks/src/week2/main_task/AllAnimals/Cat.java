package week2.main_task.AllAnimals;


public class Cat extends Animal{

    public Cat(String name) {
        super(name);
        setSound("Mew-Mew");
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

