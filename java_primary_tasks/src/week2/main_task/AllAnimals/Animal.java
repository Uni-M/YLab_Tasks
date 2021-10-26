package week2.main_task.AllAnimals;

public abstract class Animal {

    private boolean isSleeping = false;

    abstract void voice();

    public void speak(){
        if (isSleeping != false){
            voice();
        }
    }

    public void sleep(){
        isSleeping = true;
    }

    public void eat() {
        isSleeping = false;
    }
}