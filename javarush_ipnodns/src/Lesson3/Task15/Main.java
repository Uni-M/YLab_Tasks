package Lesson3.Task15;

//	Дополнительные задания для выполнения в Intellij Idea
//            1	Жить хорошо, а хорошо жить еще лучше
//            Вывести на экран надпись «Жить хорошо, а хорошо жить еще лучше»
//            2	Я не хочу изучать Java, я хочу большую зарплату
//            Вывести на экран десять раз надпись «Я не хочу изучать Java, я хочу большую зарплату»
//            3	Я буду зарабатывать $50 в час
//            Ввести с клавиатуры число n. Вывести на экран надпись «Я буду зарабатывать $n в час».
//            Пример:
//            Я буду зарабатывать $50 в час

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        first();
        second();
        third();
    }

    public static void first(){
        System.out.println("Жить хорошо, а хорошо жить еще лучше");
    }

    public static void second(){
        for (int i = 0; i < 10; i++){
            System.out.println("Я не хочу изучать Java, я хочу большую зарплату");
        }
    }

    public static void third() throws IOException {

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String money = bufferedReader.readLine();
        System.out.println("Я буду зарабатывать " + money + " в час");
    }
}


