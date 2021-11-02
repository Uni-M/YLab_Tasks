package level1.task9;

// 	Напиши программу, которая выводит на экран надпись: «Слава Роботам! Убить всех человеков!» 16 раз.

public class Main {
    public static void main(String[] args) {
        Main.printString();
    }

    static void printString(){
        for (int i = 0; i < 16; i++){
            System.out.println("Слава Роботам! Убить всех человеков!");
        }
    }
}
