package level3.keyboard_input_tasks.task1;

//	Как захватить мир
//
//            Ввести с клавиатуры число и имя, вывести на экран строку:
//            «имя» захватит мир через «число» лет. Му-ха-ха!
//            ( Последовательность вводимых данных имеет большое значение.)
//
//            Пример:
//            Вася захватит мир через 8 лет. Му-ха-ха!

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine();
        String age = bufferedReader.readLine();

        System.out.println(name + " захватит мир через " + age + " лет. Му-ха-ха!");

    }
}
