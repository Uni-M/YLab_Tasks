package level3.keyboard_input_tasks.task4;

//Спонсор - это звучит гордо
//
//        Ввести с клавиатуры два имени и вывести надпись:
//        name1 проспонсировал name2, и она стала известной певицей.
//
//        Пример:
//        Коля проспонсировал Лену, и она стала известной певицей.

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();

        System.out.println(name1 + " проспонсировал " + name2 + ", и она стала известной певицей.");
    }
}
