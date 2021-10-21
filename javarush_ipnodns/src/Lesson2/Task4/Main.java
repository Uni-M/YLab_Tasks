package javarush.ipnodns.Lesson2.Task4;

//   Закоментарь несколько строк, чтобы на экран вывелось число 19

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 2;

        x++;
        x = x + y;
        y = ++y * x;
        x = x - y;
        //x *= x;
        x = x * 2;
        y = x + y;
        //x = x * y;
        y *= y;
        x = (x + y) * x;
        x = ((x + y) / y) * 2;

        System.out.println(x+y);
    }
}
