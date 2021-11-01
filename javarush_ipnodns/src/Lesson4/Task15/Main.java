package Lesson4.Task15;

// S-квадрат
//
//Вывести на экран квадрат из 10х10 букв S используя цикл while.
//Буквы в каждой строке не разделять.

public class Main {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0){
            int j = 10;
            while (j > 0){
                System.out.print("S");
                j--;
            }
            System.out.println();
            i--;
        }
    }
}
