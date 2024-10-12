package com.varkovich.lesson_5;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Создать трехмерный массив из целых чисел.
 * С помощью циклов "пройти" по всему массиву и увеличить каждый
 * элемент на заданное число. Пусть число, на которое будет
 * увеличиваться каждый элемент, задается из консоли.
 */
public class Task_0 {

    public static void main(String[] args) {
        int[][][] array = new int[2][2][2];
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = console.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int z = 0; z < array[i][j].length; z++) {
                    array[i][j][z] += number;
                }
            }
        }

        System.out.println("Final array:");
        System.out.println(Arrays.deepToString(array));
    }
}
