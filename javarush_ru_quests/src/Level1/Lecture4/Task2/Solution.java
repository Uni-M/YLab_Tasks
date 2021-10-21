package javarush.quests.Level1.Lecture4.Task2;

//  Оконные работы
//  Требования:
//        •	Объявление и инициализацию полей класса Window изменять нельзя.
//        •	Метод changeSize класса Window должен изменять значения полей класса согласно переданным данным.
//        •	Объявление метода changeSize и названия параметров изменять нельзя.

public class Solution {
    public static void main(String[] args) {
        Window window = new Window();
        window.printSize();
        window.changeSize(4, 5);
        window.printSize();
    }
}
