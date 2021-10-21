package javarush.ipnodns.Lesson1.Task2;

//	Напиши программу, которая выводит на экран надпись:
// «Когда я вырасту, то хочу быть паровым экскаватором!» 10 раз.

public class Ten_Strings {
    private String str = "Когда я вырасту, то хочу быть паровым экскаватором!";

    public void Print10Times(){
        for (int i = 0; i < 10; i++){
            System.out.println(str);
        }
    }
}
