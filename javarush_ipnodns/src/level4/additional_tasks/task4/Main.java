package level4.additional_tasks.task4;

// Меня зовут 'Вася'...
//
//Ввести с клавиатуры строку name.
//Ввести с клавиатуры дату рождения (три числа): y, m, d.
//Вывести на экран текст:
//«Меня зовут name
//Я родился d.m.y»
//
//Пример:
//Меня зовут Вася
//Я родился 15.2.1988

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        String d = bufferedReader.readLine();
        String m = bufferedReader.readLine();
        String y = bufferedReader.readLine();

        System.out.println("Меня зовут " + name +"\nЯ родился " + d + "." + m + "." + y);
    }
}
