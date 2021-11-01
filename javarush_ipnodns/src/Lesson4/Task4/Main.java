package Lesson4.Task4;

//Реализовать метод setName, чтобы с его помощью можно было устанавливать
// значение переменной private String fullName равное значению локальной переменной String fullName.

class Cat
{
    private String fullName;
    public void setName(String firstName, String lastName)
    {
        String fullName = firstName + lastName;
        this.fullName = fullName;
    }
}


public class Main {
    public static void main(String[] args) {
    }
}