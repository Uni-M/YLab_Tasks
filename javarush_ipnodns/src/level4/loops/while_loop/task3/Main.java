package level4.loops.while_loop.task3;

// Хорошего не бывает много
//
//Ввести с клавиатуры строку и число N.
//Вывести на экран строку N раз, используя цикл while.
//
//Пример ввода:
//абв
//2
//Пример вывода:
//абв
//абв

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String str = bufferedReader.readLine();
        int count = Integer.parseInt(bufferedReader.readLine());

        while (count > 0){
            System.out.println(str);
            count--;
        }
    }
}
