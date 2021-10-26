package Lesson1.Task6;

/*
    Задание: написать программу, которая выводит на экран строки:
    Меня зовут Амиго.

    Я согласен на зарплату $800/месяц в первый год.
    Я согласен на зарплату $1500/месяц во второй год.
    Я согласен на зарплату $2200/месяц в третий год.
    Я согласен на зарплату $2700/месяц в четвертый год.
    Я согласен на зарплату $3200/месяц в пятый год.

    Поцелуй мой блестящий металлический зад!
*/
public class Employee {
    private String name;
    private Integer salary;

    Employee(String name) {
        this.name = name;
    }


    private String[] months = {"первый", "второй", "третий", "четвертый", "пятый"};

    public void contractGood(){
        System.out.println("Меня зовут " + name + ".\n");

        int salary = 800;
        for (int i = 1; i <= months.length; i++){
            System.out.println("Я согласен на зарплату $" + salary + "/месяц в " + months[i-1] + " год.");
            if(i < 3){
                salary += 700;
            }else {
                salary += 500;
            }
        }

        System.out.println("\nПоцелуй мой блестящий металлический зад!");
    }
}

