package level4.loops.while_loop.task2;

// 10 чисел наоборот
//Вывести на экран числа от 10 до 1, используя цикл while.

public class Main {
    public static void main(String[] args) {
        int i = 10;

        while (i > 0){
            System.out.println(i--);
        }
    }
}
