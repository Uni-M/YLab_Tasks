package javarush.ipnodns.Lesson2.Task8;

//	Дата рождения
//  Вывести на экран дату своего рождения в виде: MAY 1 2012

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate myBDay = LocalDate.of(1991, 7, 25);
        System.out.println(myBDay.getMonth() + " " + myBDay.getYear() + " " + myBDay.getDayOfMonth());
    }
}



