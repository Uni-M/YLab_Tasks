package level4.loops.for_loop.task4;

// Рисуем линии
//
//Используя цикл for вывести на экран:
//- горизонтальную линию из 10 восьмёрок
//- вертикальную линию из 10 восьмёрок.

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.print(8);
        }
        for (int i = 0; i < 10; i++){
            System.out.println(8);
        }
    }
}
