package Level2.Lecture3.Task3;

//  Анализ строк
//  Требования:
//        •	Метод countDigits(String) должен возвращать количество цифр в переданной строке.
//        •	Метод countLetters(String) должен возвращать количество букв в переданной строке.
//        •	Метод countSpaces(String) должен возвращать количество пробелов в переданной строке.

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int digitCounter = 0;
        for(char ch: string.toCharArray()){
            if(Character.isDigit(ch)){
                digitCounter++;
            }
        }
        return digitCounter;
    }

    public static int countLetters(String string) {
        int lettersCounter = 0;
        for(char ch: string.toCharArray()){
            if(Character.isLetter(ch)){
                lettersCounter++;
            }
        }
        return lettersCounter;
    }

    public static int countSpaces(String string) {
        int spacesCounter = 0;
        for(char ch: string.toCharArray()){
            if(Character.isSpaceChar(ch)){
                spacesCounter++;
            }
        }
        return spacesCounter;
    }
}

