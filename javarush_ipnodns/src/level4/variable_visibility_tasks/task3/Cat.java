package level4.variable_visibility_tasks.task3;

//Реализовать метод setCatsCount так, чтобы с его помощью можно было
// устанавливать значение переменной catsCount равное переданному параметру.
public class Cat
{
    private static int catsCount = 0;
    public static void setCatsCount(int catsCount)
    {
        Cat.catsCount = catsCount;
    }

    public static void main(String[] args) {

    }
}