package Level1.Lecture7.Task4;


//  Затенение поля класса
//  Требования:
//        •	В классе Solution должно быть публичное статическое поле salary типа int.
//        •	В классе Solution должен быть публичный статический метод add(int) с типом возвращаемого значения void.
//        •	Исправь ошибку, чтобы программа работала корректно.

public class Solution {
    public static int salary;

    public static void add(int increase) {
        //int salary = Solution.salary;
        Solution.salary += increase;
    }
    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}
