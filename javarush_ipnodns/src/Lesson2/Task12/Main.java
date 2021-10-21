package javarush.ipnodns.Lesson2.Task12;

/*
    Сумма 10 чисел
    Вывести на экран сумму чисел от 1 до 10 построчно:
    1
    1+2=3
    1+2+3=6
    1+2+3+4=10
    …
    Пример вывода:
    1
    3
    6
    10
    …
 */
public class Main {
    public static void main(String[] args) {

        for (int i = 1; i < 10; i++){
            int sum = 0;

            for (int j = 1; j <= i; j++){
                sum += j;
            }

            System.out.println(sum);
        }
    }

}
