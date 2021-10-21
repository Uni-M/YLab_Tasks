package javarush.ipnodns.Lesson1.Task5;
/*
    Задание: вывести на экран текст
    Меня зовут Амиго.

    Я согласен на зарплату $10/месяц в первый год.
    Я согласен на зарплату $20/месяц во второй год.
    Я согласен на зарплату $30/месяц в третий год.
    Я согласен на зарплату $40/месяц в четвертый год.
    Я согласен на зарплату $50/месяц в пятый год.

    Спасибо за щедрость, друг Риша!
*/

public class Employee {
    private String name;
    private Integer salary;

    public Employee(String name) {
        this.name = name;
    }


    private String[] months = {"первый", "второй", "третий", "четвертый", "пятый"};

    public void contractBad(){
        System.out.println("Меня зовут " + name + ".\n");

        salary = 10;
        for (int i = 1; i <= months.length; i++){
            System.out.println("Я согласен на зарплату $" + salary + "/месяц в " + months[i-1] + " год.");
            salary += 10;
        }

        System.out.println("\nСпасибо за щедрость, друг Риша!");
    }
}
