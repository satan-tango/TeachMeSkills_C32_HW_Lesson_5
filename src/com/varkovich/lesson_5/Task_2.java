package com.varkovich.lesson_5;


/**
 * Шахматная доска
 * Создать программу для раскраски шахматной доски с помощью цикла.
 * Создать двумерный массив String'ов 8х8. С помощью циклов задать
 * элементам циклам значения B(Black) или W(White). Результат работы
 * программы:
 * W B W B W B W B
 * B W B W B W B W
 * W B W B W B W B
 * B W B W B W B W
 * W B W B W B W B
 * B W B W B W B W
 * W B W B W B W B
 * B W B W B W B W
 */
public class Task_2 {

    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        boolean whiteTrigger = true;

        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[i].length; j++) {
                if (whiteTrigger) {
                    chessBoard[i][j] = "W";
                    whiteTrigger = false;
                } else {
                    chessBoard[i][j] = "B";
                    whiteTrigger = true;
                }
                System.out.print(chessBoard[i][j] + " ");
            }
            whiteTrigger = !whiteTrigger;
            System.out.println();
        }
    }
}
