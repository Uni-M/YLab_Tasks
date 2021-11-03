package level5.object_initialization_tasks.task1;

//Создать класс Friend
//
//Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
//- Имя
//- Имя, возраст
//- Имя, возраст, пол

public class Friend {
    String name;
    int age;
    String gender;

    public void initialize(String name)
    {
        this.name = name;
    }

    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
