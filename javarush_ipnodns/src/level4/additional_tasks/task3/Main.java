package level4.additional_tasks.task3;

// Посчитать сумму чисел
//
// Вводить с клавиатуры числа и считать их сумму.
// Если пользователь ввел -1, вывести на экран сумму и завершить программу.
// -1 должно учитываться в сумме.

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        boolean isExit = false;

        while (!isExit){
            int a = Integer.parseInt(bufferedReader.readLine());

            if (a != -1){
                sum += a;
            }else{
                System.out.println(sum);
                isExit = true;
            }
        }
    }
}
