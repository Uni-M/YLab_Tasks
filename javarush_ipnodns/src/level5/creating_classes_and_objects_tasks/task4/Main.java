package level5.creating_classes_and_objects_tasks.task4;

//Создать три объекта типа Cat
//
//В методе main создать три объекта типа Cat и заполнить их данными.
// Использовать класс Cat из первой задачи. Класс Cat создавать не надо.


import level5.creating_classes_and_objects_tasks.task1.Cat;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Vaska";
        cat1.age = 3;
        cat1.strength = 4;
        cat1.weight = 3;

        Cat cat2 = new Cat();
        cat1.name = "Pushok";
        cat1.age = 3;
        cat1.strength = 3;
        cat1.weight = 6;

        Cat cat3 = new Cat();
        cat1.name = "Pyatno";
        cat1.age = 7;
        cat1.strength = 5;
        cat1.weight = 4;
    }
}
