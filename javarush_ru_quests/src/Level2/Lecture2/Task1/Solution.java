package Level2.Lecture2.Task1;

//  Автоупаковка
//  Требования:
//        •	В классе Solution должны быть 8 переменных примитивных типов данных с именами вида типValue.
//        •	В классе Solution должны быть 8 объектов типа класс-обертка примитивного типа с именами вида типValueBox.
//        •	При создании объектов-оберток должны использоваться существующие переменные примитивных типов и метод Тип.valueOf(примитив).

public class Solution {
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;

    float floatValue;
    double doubleValue;

    char charValue;
    boolean booleanValue;

    //напишите тут ваш код:
    Byte byteValueBox = Byte.valueOf(byteValue);
    Short shortValueBox = Short.valueOf(shortValue);
    Integer integerValueBox = Integer.valueOf(intValue);
    Long longValueBox = Long.valueOf(longValue);

    Float floatValueBox = Float.valueOf(floatValue);
    Double doubleValueBox = Double.valueOf(doubleValue);

    Character characterValueBox = Character.valueOf(charValue);
    Boolean booleanValueBox = Boolean.valueOf(booleanValue);
}
