package Lesson4.Task21;

// Все любят Мамбу
//
//Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
//
//Пример текста:
//Света любит меня.
//Света любит меня.
//…

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();

        for (int i = 0; i < 10; i++){
            System.out.println(name + " любит меня.");
        }
    }
}
