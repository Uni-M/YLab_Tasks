package Lesson3.Task4;

//  Произведение 10 чисел
//  Вывести на экран произведение чисел от 1 до 10.
//  Подсказка: будет три миллиона с хвостиком

public class Main {
    public static void main(String[] args) {
        int ans = 1;
        for (int i = 1; i <= 10; i++){
            ans *= i;
        }
        System.out.println(ans);
    }
}
