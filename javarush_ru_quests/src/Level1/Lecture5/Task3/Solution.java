package javarush.quests.Level1.Lecture5.Task3;

//  Объекты внутренних и вложенных классов
//Требования:
//        •	В методе main класса Solution должен быть создан объект класса Inner.
//        •	В методе main класса Solution должен быть создан объект класса Nested.
//        •	Класс Outer изменять нельзя.

public class Solution {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
