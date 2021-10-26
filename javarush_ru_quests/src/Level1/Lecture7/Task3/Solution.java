package Level1.Lecture7.Task3;

import java.util.Arrays;

//  Забытая инициализация
//  Требования:
//        •	Исправь ошибку, что бы программа работала корректно.

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
    }
}
