package Level2.Lecture4.Task2;

import java.util.ArrayList;

//  Переворачивание данных
//  Требования:
//        •	Поле numbers должно быть типа ArrayList<Integer>.
//        •	Метод init() должен заполнять список numbers числами от 0 до 9.
//        •	Метод reverse() должен переставить значения списка numbers в обратном порядке.

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(Integer.valueOf(i));
        }
    }

    public static void reverse() {
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i));
            numbers.set(n - i, temp);
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

