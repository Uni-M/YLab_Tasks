package Level2.Lecture3.Task1;

//  Плата по счетам
//  Требования:
//        •	Поле balance должно инициализироваться при объявлении значением Integer.MAX_VALUE.
//        •	Метод processPayment(String) должен уменьшать поле balance на значение переданного аргумента.

public class Solution {
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Текущий баланс : " + balance);
        processPayment(bill);
        System.out.println("Текущий баланс : " + balance);
    }

    public static void processPayment(String bill) {
        balance -= Integer.parseInt(bill);
    }
}