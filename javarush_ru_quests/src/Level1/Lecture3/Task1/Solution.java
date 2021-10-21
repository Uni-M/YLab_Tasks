package javarush.quests.Level1.Lecture3.Task1;

//  Солнечная система — наш дом
//  Требования:
//        •	Программа должна выводить на экран текст, указанный в примере.
//        •	При выводе текста нужно использовать все переменные класса SolarSystem.

public class Solution {

    public static void main(String[] args) {

        System.out.println("Человечество живет в Солнечной системе.");
        System.out.println("Ее возраст около " + SolarSystem.age + " лет.");
        System.out.println("В Солнечной системе " + SolarSystem.planetsCount + " известных планет.");
        System.out.println("Как и большинство звездных систем, состоит из " + SolarSystem.starsCount + " звезды.");
        System.out.println("Звезды по имени " + SolarSystem.starName + ".");
        System.out.println("Расстояние к центру галактики составляет " + SolarSystem.galacticCenterDistance + " световых лет.");
        System.out.println("Каждый обитатель Солнечной системы должен знать эту информацию!");

    }
}
