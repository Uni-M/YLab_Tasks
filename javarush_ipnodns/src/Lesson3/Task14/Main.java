package Lesson3.Task14;

//Чистая любовь
//
//        Ввести с клавиатуры три имени, вывести на экран надпись name1 + name2 + name3 = Чистая любовь, да-да!
//
//        Пример:
//        Вася + Ева + Анжелика = Чистая любовь, да-да

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();
        String name3 = bufferedReader.readLine();

        System.out.println(name1 + name2 + name3 + "= Чистая любовь, да-да!");

    }
}
