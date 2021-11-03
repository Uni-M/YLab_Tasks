package level5.object_initialization_tasks.task2;

// Создать класс Cat
//
//Создать класс Cat (кот) с пятью инициализаторами:
//- Имя
//- Имя, вес, возраст
//- Имя, возраст (вес стандартный)
//- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
//- вес, цвет, адрес (чужой домашний кот)
//
//Задача инициализатора – сделать объект валидным. Например, если вес неизвестен,
// то нужно указать какой-нибудь средний вес. Кот не может ничего не весить.
// То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String address;

//- Имя
    public void initialize(String name)
    {
        this.name = name;

    }

//- Имя, вес, возраст
    public void initialize(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }


//- Имя, возраст (вес стандартный)
    public void initialize(String name, int age)
    {
        this.name = name;
        this.weight = 3;
        this.age = age;
    }

//- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
    public void initialize(int weight, String color)
    {
        this.name = null;
        this.weight = weight;
        this.age = 4;
        this.address = null;
        this.color = color;
    }

//- вес, цвет, адрес (чужой домашний кот)
    public void initialize(int weight, String color, String address)
    {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
