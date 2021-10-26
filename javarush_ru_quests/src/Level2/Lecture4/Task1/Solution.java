package Level2.Lecture4.Task1;

import java.util.ArrayList;

//Бухгалтерия
//Требования:
//        •	Метод paySalary(String) должен добавлять в список alreadyGotSalaryEmployees имя сотрудника,
//          если он есть в списке waitingEmployees.
//        •	Метод paySalary(String) должен заменять имя сотрудника на значение null,
//          если он есть в списке waitingEmployees.
//        •	Метод paySalary(String) не должен изменять списки waitingEmployees и alreadyGotSalaryEmployees,
//          если переданного имени нет в списке waitingEmployees.
//        •	Если в метод paySalary(String) передается null,
//          метод не должен добавлять это значение в waitingEmployees или alreadyGotSalaryEmployees.

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        //напишите тут ваш код:
        if(name == null){
            return;
        }

        if(waitingEmployees.contains(name)){
            alreadyGotSalaryEmployees.add(name);
            waitingEmployees.set(waitingEmployees.indexOf(name), null);
        }
    }
}

