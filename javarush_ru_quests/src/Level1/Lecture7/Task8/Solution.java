package Level1.Lecture7.Task8;

//  Студент
//  Требования:
//        •	Метод main не изменяй.
//        •	В классе Student должен быть конструктор с одним параметром.
//        •	Конструктор должен инициализировать поле name полученным аргументом.

public class Solution {
    public static void main(String[] args) {
        Student student = new Student("Амиго");
        System.out.println(student.name);
    }
}
