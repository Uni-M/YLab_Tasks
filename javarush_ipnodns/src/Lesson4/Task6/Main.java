package Lesson4.Task6;

//Минимум двух чисел
//Ввести с клавиатуры два числа, и вывести на экран минимальное из них.

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int first = Integer.parseInt(bufferedReader.readLine());
        int second = Integer.parseInt(bufferedReader.readLine());

        if(first < second){
            System.out.println(first);
        }else{
            System.out.println(second);
        }
    }
}
