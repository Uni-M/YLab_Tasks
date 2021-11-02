package level4.conditional_statement_tasks.task3;

//Сортировка трех чисел
//Ввести с клавиатуры три числа, и вывести их в порядке убывания.

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());

        if(a >= b && b >= c) System.out.println(a + " " + b + " " + c);
        if(b >= a && a >= c) System.out.println(b + " " + a + " " + c);
        if(b >= c && c >= a) System.out.println(b + " " + c + " " + a);
        if(c >= b && b >= a) System.out.println(c + " " + b + " " + a);
        if(a >= c && c >= b) System.out.println(a + " " + c + " " + b);
        if(c >= a && a >= b) System.out.println(c + " " + a + " " + b);

    }

}
