package Lesson4.Task7;

//Максимум четырех чисел
//Ввести с клавиатуры четыре числа, и вывести максимальное из них.

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());

        if(a >= b && a >= c && a >= d){
            System.out.println(a);
        }else if (b >= a && b >= c && b >= d){
            System.out.println(b);
        }else if (c >= a && c >= b && c >= d){
            System.out.println(b);
        }else {
            System.out.println(d);
        }
    }
}
