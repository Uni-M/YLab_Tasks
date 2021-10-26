package Lesson3.Task12;

//Скромность украшает человека
//
//        Ввести с клавиатуры имя и вывести надпись: name зарабатывает $5,000. Ха-ха-ха!
//
//        Пример:
//        Тимур зарабатывает $5,000. Ха-ха-ха!

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        System.out.println();
        System.out.println(name + " зарабатывает $5,000. Ха-ха-ха!");
    }
}
