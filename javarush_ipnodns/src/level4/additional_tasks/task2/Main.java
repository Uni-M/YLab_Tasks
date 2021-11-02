package level4.additional_tasks.task2;

// Среднее такое среднее
//
//Ввести с клавиатуры три числа, вывести на экран среднее из них, т.е. не самое большое и не самое маленькое.

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if ((a >= b && b >= c) || (c >= b && b >= a)){
            System.out.println(b);
        } else if ((b >= a && a >= c) || (c >= a && a >= b)){
            System.out.println(a);
        } else if ((a >= c && c >= b) || (b >= c && c >= a)){
            System.out.println(c);
        }
    }
}
