package level4.variable_visibility_tasks.task2;

//Реализовать метод addNewCat, чтобы при его вызове (т.е. добавлении нового кота),
// количество котов увеличивалось на 1.
// За количество котов отвечает переменная catsCount.

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat.addNewCat();
    }
}

class Cat
{
    private static int catsCount = 0;
    public static void addNewCat()
    {
        catsCount++;
    }
}