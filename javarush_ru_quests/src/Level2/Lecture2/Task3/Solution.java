package javarush.quests.Level2.Lecture2.Task3;

//  Сравнение чисел
//  Требования:
//        •	Поля класса Solution изменять нельзя.
//        •	Вывод должен соответствовать условию.
//        •	Добавь использование метода equals() минимальное количество раз.

public class Solution {
    static Integer first = 1000;
    static Integer second = 1000;
    static int third = 1000;

    public static void main(String[] args) {
        System.out.println(first.equals(second));
        System.out.println(third == second);
        System.out.println(third == first);
    }
}
