package level5.сonstructor_tasks.task4;

//Создать класс Circle
//
//Создать класс (Circle) круг, с тремя конструкторами:
//- centerX, centerY, radius
//- centerX, centerY, radius, width
//- centerX, centerY, radius, width, color

public class Circle {
    int centerX, centerY, radius, width;
    String color;

    public Circle(int centerX, int centerY, int radius)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius, int width)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }


    public Circle(int centerX, int centerY, int radius, int width, String color)
    {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
