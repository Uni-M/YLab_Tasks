package level2.task5;

//   Создайте 10 переменных типа Cat и 8 объектов типа Cat.

public class Main {
    Cat misa;
    Cat kilya;
    Cat murka = new Cat("Murka");
    Cat vaska = new Cat("Vaska");
    Cat pushok = new Cat("Pushok");
    Cat manya = new Cat("Manya");
    Cat gotik = new Cat("Gotik");
    Cat vika = new Cat("Vika");
    Cat leva = new Cat("Leva");
    Cat yasha = new Cat("Yasha");
}

class Cat{
    String name;

    Cat (String name){
        this.name = name;
    }
}
