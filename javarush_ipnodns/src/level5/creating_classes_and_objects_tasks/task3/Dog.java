package level5.creating_classes_and_objects_tasks.task3;

// Геттеры и сеттеры для класса Dog
//
//Создать class Dog. У собаки должна быть кличка String name и возраст int age.
//Создайте геттеры и сеттеры для всех переменных класса Dog.

public class Dog {
    private String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
