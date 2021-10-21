package javarush.ipnodns.Lesson2.Task2;

//   Создать 3 объекта типа Dog (собака) и присвоить им имена "Max", "Bella", "Jack".

public class Main {
    public static void main(String[] args) {
        Dog dogMax = new Dog("Max");
        Dog dogBella = new Dog("Bella");
        Dog dogJack = new Dog("Jack");
    }
}

class Dog{
    String name;

    Dog(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}


