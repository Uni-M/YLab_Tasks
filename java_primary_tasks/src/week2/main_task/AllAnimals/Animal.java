package week2.main_task.AllAnimals;

public abstract class Animal {
    private String name;
    private boolean isEating = false;
    private boolean isSleeping = false;

    Animal(String name){
        this.name = name;
    }

    abstract void eat();
    abstract void speak();

    public void sleep(){
        isSleeping = true;
        isEating = false;
        System.out.println(name + " is sleeping");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    protected void setEating(boolean eating){
        isEating = eating;
    }

//    protected boolean getEating() {
//        return isEating;
//    }

    protected void setSleeping(boolean sleeping){
        isSleeping = sleeping;
    }

    protected boolean getSleeping() {
        return isSleeping;
    }
}