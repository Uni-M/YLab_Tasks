package level2.task6;

//  Создайте объект типа Cat(кот), объект типа Dog (собака), объект типа Fish (рыбка) и объект типа Woman.
//  Присвойте каждому животному владельца (owner).

public class Main {
    public static void main(String[] args) {
        Woman anna = new Woman("Anna");

        Cat vaska = new Cat("Vaska");
        vaska.setOwner(anna);

        Dog max = new Dog("Max");
        max.setOwner(anna);

        Fish flip = new Fish("Flip");
        flip.setOwner(anna);
    }
}

class Cat{
    String name;
    private Woman owner;

    Cat(String name){
        this.name = name;
    }

    public String getOwner(){
        return owner.getName();
    }

    public void setOwner(Woman owner){
        this.owner = owner;
    }

    public String getName() {
        return name;
    }
}

class Dog{
    private String name;
    private Woman owner;

    Dog(String name){
        this.name = name;
    }

    public String getOwner(){
        return owner.getName();
    }

    public void setOwner(Woman owner){
        this.owner = owner;
    }

    public String getName() {
        return name;
    }
}

class Fish{
    String name;
    Woman owner;

    Fish(String name){
        this.name = name;
    }

    public String getOwner(){
        return owner.getName();
    }

    public void setOwner(Woman owner){
        this.owner = owner;
    }

    public String getName() {
        return name;
    }
}

class Woman{
    private String name;
    Woman(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
