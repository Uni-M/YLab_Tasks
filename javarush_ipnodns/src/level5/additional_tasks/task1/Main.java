package level5.additional_tasks.task1;
//Три класса
//
//По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).
//Подумай, что должен возвращать метод toString в классах Cat и Dog?
//В методе main создай по два объекта каждого класса и выведи их на экран.
//Объекты класса Duck уже созданы и выводятся на экран.

public class Main {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        System.out.println(duck1);
        Duck duck2 = new Duck();
        System.out.println(duck2);

        Dog dog1 = new Dog();
        System.out.println(dog1);
        Dog dog2 = new Dog();
        System.out.println(dog2);

        Cat cat1 = new Cat();
        System.out.println(cat1);
        Cat cat2 = new Cat();
        System.out.println(cat2);
    }
}

class Duck{
    public String toString() {
        return "Duck";
    }
}

class Cat{
    public String toString() {
        return "Cat";
    }
}

class Dog{
    public String toString() {
        return "Dog";
    }
}