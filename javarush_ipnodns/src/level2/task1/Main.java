package level2.task1;

//    Создать объект типа Cat 2 раза.

public class Main {
    public static void main(String[] args) {
        Cat vaska = new Cat("Vaska");
        Cat murka = new Cat("Murka");
    }
}

class Cat{
    private String name;
    Cat(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}