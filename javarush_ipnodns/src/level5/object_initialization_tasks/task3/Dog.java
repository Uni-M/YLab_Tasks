package level5.object_initialization_tasks.task3;

//Создать класс Dog
//
//Создать класс Dog (собака) с тремя инициализаторами:
//- Имя
//- Имя, рост
//- Имя, рост, цвет

public class Dog {
    String name;
    int height;
    String color;

    public void initialize(String name)
    {
        this.name = name;
    }

    public void initialize(String name, int height)
    {
        this.name = name;
        this.height = height;
    }

    public void initialize(String name, int height, String color)
    {
        this.name = name;
        this.height = height;
        this.color = color;
    }
}
