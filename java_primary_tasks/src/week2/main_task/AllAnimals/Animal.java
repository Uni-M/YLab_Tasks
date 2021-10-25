package week2.main_task.AllAnimals;

public abstract class Animal {

    private String sound = "";
    private boolean isEating = false;
    private boolean isSleeping = false;



    public void eat(){
        isEating = true;
    };
    abstract void speak();

    public void sleep(){
        isSleeping = true;
        isEating = false;
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