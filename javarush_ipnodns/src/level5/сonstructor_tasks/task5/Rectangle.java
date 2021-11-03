package level5.сonstructor_tasks.task5;

// Создать класс прямоугольник (Rectangle)
//
//Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше конструкторов:
//
//Примеры:
//- заданы 4 параметра: left, top, width, height
//- ширина/высота не задана (оба равны 0)
//- высота не задана (равно ширине) создаём квадрат
//- создаём копию другого прямоугольника (он и передаётся в параметрах)

public class Rectangle {
    int top, left, width, height;

    public Rectangle(int top){
        this.top = top;
    }

    //- заданы 4 параметра: left, top, width, height
    public Rectangle(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    //- ширина/высота не задана (оба равны 0)
    public Rectangle(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    //- высота не задана (равно ширине) создаём квадрат
    public Rectangle(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    //- создаём копию другого прямоугольника (он и передаётся в параметрах)
    public Rectangle(Rectangle other)
    {
        this.top = other.top;
        this.left = other.left;
        this.width = other.width;
        this.height = other.height;
    }
}

