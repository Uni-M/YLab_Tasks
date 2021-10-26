package Level1.Lecture5.Task3;

public class Outer {
    class Inner {
        Inner() {
            System.out.println("Создание объекта внутреннего класса");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Создание объекта вложенного класса");
        }
    }
}
