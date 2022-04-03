package com.company;

import java.util.Scanner;
public class lesson3 {
    public static void main(String[] args) {
        first();
        second();
        third();
        fourth();
        fifth();
        sixth();
        int[] arr = {1, 8, 2, 9, 6, 3, 7, 4};
        System.out.println(seventh(arr));
    }

    public static void first() {
        int[] arr = {1, 0, 1, 0, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }

    public static void second() {
        int[] arr = new int[100];
        for (int i = 1; i <= arr.length; i++) {
            System.out.println(i);
        }
    }

    public static void third() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.println(arr[i] * 2);
            } else {
                System.out.println(arr[i]);
            }
        }
    }

    public static void fourth() {
        int[][] table = new int[3][3];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (i == j) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = 0;
                }
                System.out.println(table[i][j]);
            }
        }
    }

    public static void fifth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа. Первое - кол-во элементов в массиве. Второе - значение ячеек массива.");
        int len = scanner.nextInt();
        int initialValue = scanner.nextInt();
        scanner.close();

        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.println(arr[i]);
        }
    }

    public static void sixth() {
        int[] arr = {6, 34, 7, 3, 5, 4, 2, 8, 1, 13, 20};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Максимальное число " + max + ". Минимальное число " + min + '.');
    }

    public static boolean seventh(int[] arr) {
        int leftSum = 0;
        int rightSum = sum(arr, 0, arr.length);
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            rightSum -= arr[i];
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }
    private static int sum(int[] arr, int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

