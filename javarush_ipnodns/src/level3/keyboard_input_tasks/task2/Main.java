package level3.keyboard_input_tasks.task2;

//  Зарплата через 5 лет
//
//  Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет.
//
//  Пример:
//  Коля получает 3000 через 5 лет.

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        String number1 = bufferedReader.readLine();
        String number2 = bufferedReader.readLine();

        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");
    }
}
