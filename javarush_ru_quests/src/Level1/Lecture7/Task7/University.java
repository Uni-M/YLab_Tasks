package Level1.Lecture7.Task7;

//  Составляем список студентов
//  Требования:
//        •	В классе University должно быть приватное final не статическое поле students типа String[], которое сразу инициализируется.
//        •	В классе University должен быть метод public void addStudent(String), который добавляет переданного студента в список students.
//        •	В классе University должен быть метод public void printStudents, который выводит всех студентов в консоли.
//        •	Метод main должен дважды вызывать метод addStudent.
//        •	Метод main должен вызывать метод printStudents один раз.

public class University {
    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        University university = new University();
        university.addStudent("Максим Федоренко");
        university.addStudent("Олег Кесарчук");
        university.printStudents();
    }
}

