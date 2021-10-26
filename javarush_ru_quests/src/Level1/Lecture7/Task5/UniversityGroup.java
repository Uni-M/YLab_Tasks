package Level1.Lecture7.Task5;

import java.util.ArrayList;
import java.util.List;

//  Почувствуй себя деканом
//  Требования:
//        •	В классе UniversityGroup должно быть публичное не статическое поле students типа List<String>.
//        •	В классе UniversityGroup должен быть публичный не статический метод exclude(String) с типом возвращаемого значения void.
//        •	Метод exclude должен удалять из списка переданного студента.

public class UniversityGroup {
    public List<String> students;

    public UniversityGroup() {
        students = new ArrayList<>();
        students.add("Сергей Фрединский");
        students.add("Виталий Правдивый");
        students.add("Максим Козыменко");
        students.add("Наталия Андрющенко");
        students.add("Ира Величенко");
        students.add("Николай Соболев");
        students.add("Снежана Слободенюк");
    }

    public void exclude(String excludedStudent) {
        students.removeIf((String x) -> x.equals(excludedStudent));
    }

    public static void main(String[] args) {
        UniversityGroup universityGroup = new UniversityGroup();
        universityGroup.exclude("Виталий Правдивый");
        universityGroup.students.forEach(System.out::println);
    }
}
