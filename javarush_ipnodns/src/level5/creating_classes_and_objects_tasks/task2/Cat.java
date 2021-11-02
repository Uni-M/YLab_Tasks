package level5.creating_classes_and_objects_tasks.task2;

// Реализовать метод fight
//
//Реализовать метод boolean fight(Cat anotherCat):
// реализовать механизм драки котов в зависимости от их веса, возраста и силы.
// Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
// Должно выполняться условие:
// если cat1.fight(cat2) == true , то cat2.fight(cat1) == false

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public boolean fight(Cat anotherCat){
        int a = 0;
        int b = 0;

        if (this.age > anotherCat.age){
            a++;
        }else if(this.age < anotherCat.age){
            b++;
        }

        if (this.weight > anotherCat.weight){
            a++;
        }else if(this.weight < anotherCat.weight){
            b++;
        }

        if (this.strength > anotherCat.strength){
            a++;
        }else if(this.strength < anotherCat.strength){
            b++;
        }

        return a > b;
    }
}
