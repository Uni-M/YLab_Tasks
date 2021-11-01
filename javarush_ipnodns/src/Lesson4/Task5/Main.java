package Lesson4.Task5;

//Написать код, который бы подсчитывал количество созданных котов (count)
// и на экран выдавалось правильно их количество.

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat.count++;
        Cat cat2 = new Cat();
        Cat.count++;
        System.out.println("Cats count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}


