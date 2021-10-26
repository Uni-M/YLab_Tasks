package Level2.Lecture3.Task2;

//  Метод деления
//  Требования:
//        •	Метод divide(double a, double b) должен выводить в консоли результат деления числа a на число b.
//        •	Метод divide(double a, double b) должен выводить в консоли "Infinity" согласно пункту 1 условия.
//        •	Метод divide(double a, double b) должен выводить в консоли "-Infinity"согласно пункту 2 условия.
//        •	Метод divide(double a, double b) должен выводить в консоли "NaN" согласно пункту 3 условия.

public class Solution {

    public static void main(String[] args) {
        divide(1, 0);
        divide(-1, 0);
        divide(0, 0);
        divide(100, 20);
        divide(200, 20);
    }

    public static void divide(double a, double b) {

        System.out.println(a/b);
    }
}
