package level1.task4;

//  Внесите изменения в программу, чтобы переменная s была равна 5,
//  t была равна 6, а x равна 7. Программа должна компилироваться.

public class SomeIntegers {
    private Integer s = 5;
    private Integer t = 6;
    private Integer x = 7;

    void getInteger(Character str){
        switch (str) {
            case 's':
                System.out.println(s);
                break;
            case 't':
                System.out.println(t);
                break;
            case 'x':
                System.out.println(x);
                break;
            default:
                System.out.println("Input Error");
                break;
        };
    }
}
