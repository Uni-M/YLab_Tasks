package javarush.quests.Level1.Lecture7.Task2;

import java.util.Scanner;

//  Все буквы маленькие
//  Требования:
//        •	Программа должна считать с консоли строку и вывести ее на экран в нижнем регистре.

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        String newLine = line.toLowerCase();
        System.out.println(newLine);
    }
}
