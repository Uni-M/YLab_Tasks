package level3.concatenation_tasks.task1;

//	Мама мыла раму
//
//            Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
//            Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять.
//
//            Пример:
//            МылаРамуМама
//            РамуМамаМыла
//            ...

public class Main {
    public static void main(String[] args) {
        String a = "Мама";
        String b = "Мыла";
        String c = "Раму";

        System.out.println(a+b+c);
        System.out.println(b+a+c);
        System.out.println(a+c+b);
        System.out.println(b+c+a);
        System.out.println(c+a+b);
        System.out.println(c+b+a);

    }
}
