package level4.conditional_statement_tasks.task4;

//Сравнить имена
//Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
//Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name1 = bufferedReader.readLine();
        String name2 = bufferedReader.readLine();

        if (name1.equals(name2)){
            System.out.println("Имена идентичны");
        }else if (name1.length() == name2.length()){
            System.out.println("Длины имен равны");
        }
    }
}
