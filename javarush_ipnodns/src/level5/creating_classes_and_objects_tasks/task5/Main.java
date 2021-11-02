package level5.creating_classes_and_objects_tasks.task5;

import level5.creating_classes_and_objects_tasks.task2.Cat;

public class Main {
    public static void main(String[] args) {
        Cat catVaska = new Cat();
        catVaska.age = 3;
        catVaska.strength = 4;
        catVaska.weight = 3;

        Cat catPushok = new Cat();
        catPushok.age = 5;
        catPushok.strength = 4;
        catPushok.weight = 4;

        Cat catPyatno = new Cat();
        catPyatno.age = 7;
        catPyatno.strength = 3;
        catPyatno.weight = 5;

        System.out.println("Pushok vs Pushok: " + catPushok.fight(catPyatno));
        System.out.println("Vaska vs Pyatno: " + catVaska.fight(catPyatno));
        System.out.println("Pushok vs Vaska: " + catPushok.fight(catVaska));

    }
}
