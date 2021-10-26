package Level1.Lecture6.Task7;

//  Правильный класс
//  Требования:
//        •	Программа должна компилироваться и работать.
//        •	В программе должен быть публичный класс Solution.
//        •	В программе должен быть класс Cat.

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.name);
    }
}
class Cat {
    String name = "Tom";
}
