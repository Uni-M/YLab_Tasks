package week2.main_task;

import week2.main_task.AllAnimals.*;
//  Обычное задание: Создать несколько классов с наследованием.
//        Каждое животное должно подавать свой голос.
//        Все животные могут подавать голос!
//        Если животное спит, то не может подать голос.
//        Если животное ест, то просыпается.


public class Main {
    public static void main(String[] args) {
        Cat murka = new Cat("Murka");
        murka.eat();
        murka.sleep();
        murka.speak();


        Dog fido = new Dog("Fido");
        fido.eat();
        fido.speak();
        fido.sleep();
        fido.speak();

        Fish bob = new Fish("Bob");
        bob.eat();
        bob.speak();
        bob.sleep();
        bob.eat();
        bob.speak();

        Rabbit musya = new Rabbit("Musya");
        musya.eat();
        musya.speak();
        musya.sleep();
        musya.speak();
    }
}


