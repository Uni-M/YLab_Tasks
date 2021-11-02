package level4.loops.for_loop.task2;

// Рисуем прямоугольник
//
//Ввести с клавиатуры два числа m и n.
//Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
//
//Пример: m=2, n=4
//8888
//8888

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(bufferedReader.readLine());
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = m; i > 0; i--){
            for (int j = n; j > 0; j--){
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
