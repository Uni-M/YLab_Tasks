package Lesson4.Task1;

//Реализовать метод setName, чтобы с его помощью можно было устанавливать значение переменной
// private String name равное переданному параметру String name.

public class Main {
    public static void main(String[] args) {
        Cat cat =  new Cat();
        cat.setName("Murka");
    }
}

class Cat
{
    private String name;
    public void setName(String name)
    {
        this.name = name;
    }
}

