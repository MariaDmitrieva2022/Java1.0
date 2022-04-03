package com.company.lesson;

public class task8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        eighth(array, 2);
    }

    private static void eighth(int[] array, int n) {
        int moveNumber = n % array.length;
        if(moveNumber < 0) {
            moveLeft(array, Math.abs(moveNumber));
        } else {
            moveRight(array, moveNumber);
        }
    }
    private  static void moveRight(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int lastValue = array[array.length - 1];
            for (int j = array.length - 1; j > 0 ; j--) {
                array[j] = array[j - 1];
            }
            array[0] = lastValue;
        }
    }
    private  static void moveLeft(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int firstValue = array[0];
            for (int j = 0; j < array.length - 1 ; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = firstValue;
        }
    }
}
