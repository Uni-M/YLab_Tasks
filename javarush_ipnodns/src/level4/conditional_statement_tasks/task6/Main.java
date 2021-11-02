package level4.conditional_statement_tasks.task6;

//И 18-ти достаточно
//Ввести с клавиатуры имя и возраст.
//Если возраст больше 20 вывести надпись «И 18-ти достаточно»

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        int age = Integer.parseInt(bufferedReader.readLine());

        if (age > 20){
            System.out.println("И 18-ти достаточно");
        }
    }
}
