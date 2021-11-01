package Lesson4.Task17;

// Четные числа
//
//Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
//Через пробел либо с новой строки.

public class Main {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++){
            System.out.print(i%2 == 0 ? i : " ");
        }
    }
}

