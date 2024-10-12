package com.varkovich.lesson_5;


/**
 * Создайте двумерный массив целых чисел.
 * Выведите на консоль сумму
 * всех элементов массива.
 */
public class Task_3 {

    public static void main(String[] args) {
        int[][] array = {{4, 6, 7, 2}, {343, 342, 222}, {12, 242, 14, 124, 124, 124}};
        int sumOfAllElements = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
                sumOfAllElements += array[i][j];
            }
            System.out.println();
        }

        System.out.printf("Sum of all elements is %d", sumOfAllElements);
    }
}
