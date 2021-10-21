package javarush.quests.Level2.Lecture2.Task2;

//  Распаковка
//  Требования:
//        •	В классе Solution должны быть 8 объектов типа класс-обертка примитивного типа с именами вида типValueBox.
//        •	В классе Solution должны быть 8 переменных примитивных типов данных с именами вида типValue.
//        •	При создании переменных примитивных типов должны использоваться существующие объекты-обертки
//          и метод типValueBox.примитивValue().

public class Solution {
    Byte byteValueBox;
    Short shortValueBox;
    Integer integerValueBox;
    Long longValueBox;

    Float floatValueBox;
    Double doubleValueBox;

    Character characterValueBox;
    Boolean booleanValueBox;

    //напишите тут ваш код:
    byte byteValue = byteValueBox.byteValue();
    short shortValue = shortValueBox.shortValue();
    int intValue = integerValueBox.intValue();
    long longValue = longValueBox.longValue();

    float floatValue = floatValueBox.floatValue();
    double doubleValue  = doubleValueBox.doubleValue();

    char charValue = characterValueBox.charValue();
    boolean booleanValue = booleanValueBox.booleanValue();
}
