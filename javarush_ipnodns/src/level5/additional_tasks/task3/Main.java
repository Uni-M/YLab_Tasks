package level5.additional_tasks.task3;

//Создай public static классы Dog, Cat.
//
//Добавь по три поля в каждый класс, на твой выбор.
//Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
//
//Пример:
//Mouse jerryMouse = new Mouse(“Jerry”, 12 (высота, см) , 5 (длина хвоста, см))

public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 11, 9);
        Cat tomCat = new Cat("Tom", 33, 30);
        Dog spikeDog = new Dog("Spike", 44, 6);
        Cat butchCat = new Cat("Butch", 34, 28);
        Mouse tuffyMouse = new Mouse("Tuffy", 8, 10);

    }

    public static class Dog{
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat{
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Mouse{
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
