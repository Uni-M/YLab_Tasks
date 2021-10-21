package javarush.ipnodns.Lesson1.Task1;

import java.util.ArrayList;

// Объявите переменные name1, name2, name3 типа String.
// Сразу же в строке объявления присвойте им какие-нибудь значения.
// Значениями могут быть любые строки.

public class People {
    private String name1 = "Anna";
    private String name2 = "Alex";
    private String name3 = "Oleg";
    private ArrayList<String> allNames = new ArrayList<String>();

    private void fillArr(){
        allNames.add(name1);
        allNames.add(name2);
        allNames.add(name3);
    }

    void getNames(){
        fillArr();
        for (String name: allNames){
            System.out.println(name);
        }
    }
}
