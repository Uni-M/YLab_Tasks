package javarush.quests.Level1.Lecture5.Task2;

//  Утильный калькулятор
//Требования:
//        •	В классе Solution нужно создать вложенный (static nested) класс Calculator.
//        •	Методы add, subtract, multiply и divide нужно перенести в класс Calculator.
//        •	В методе main должны быть вызваны методы add, subtract, multiply и divide класса Calculator.

public class Solution {
    public static final String EQUAL = " = ";
    Calculator calculator = new Calculator();

    static class Calculator{
        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        Solution.Calculator.add(a, b);
        Solution.Calculator.subtract(a, b);
        Solution.Calculator.multiply(a, b);
        Solution.Calculator.divide(a, b);
    }
}

