package level4.conditional_statement_tasks.task5;

//18+
//Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        int age = Integer.parseInt(bufferedReader.readLine());

        if (age < 18){
            System.out.println("Подрасти еще");
        }
    }
}
