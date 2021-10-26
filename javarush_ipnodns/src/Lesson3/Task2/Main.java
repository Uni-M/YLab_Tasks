package Lesson3.Task2;

//	4 скобки
//  Расставить правильно (по другому) скобки, чтобы на экран вывелось число 850
public class Main {
    public static void main(String[] args) {
        //Было:
        //System.out.println( (1 + 2) * (3 + 4) * (5 + 6) * (7 + 8) * (9 + 10) * (11 + 12) * (13 + 14) + 15);

        //Стало
        System.out.println( 1 + 2 * (3 + 4 * 5 + 6 * 7 + 8 * 9 + 10 * 11 + 12 * 13 + 14) + 15);
    }
}
