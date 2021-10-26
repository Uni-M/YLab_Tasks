package Level1.Lecture4.Task1;

//  Конвертер строки
//  Требования:
//        •	В методе main должен вызываться метод parseDouble класса Double.
//        •	В методе main должен вызываться метод round класса Math.
//        •	В консоли должно выводиться число 13.

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";

        Double result = Double.parseDouble(string);
        Long ans = Math.round(result);
        System.out.println(ans);
    }
}
