package level5.additional_tasks.task2;

//Man and Woman
//
//1. Внутри класса Solution создай public static классы Man и Woman.
//2. У классов должны быть поля: name(String), age(int), address(String).
//3. Создай конструкторы, в которые передаются все возможные параметры.
//4. Создай по два объекта каждого класса со всеми данными, используя конструктор.
//5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Oleg", 30, "Moscow, Vyatskaya st. 20-47");
        Woman woman = new Woman("Anna", 40, "Krasnoyarsk, Lenina st, 12-5");

        System.out.println(man.name + " " + man.age + " " + man.address);
        System.out.println(woman.name + " " + woman.age + " " + woman.address);

    }

    public static class Man{
        String name;
        int age;
        String address;

        Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

}


