package com.company;

public class lesson2 {
    public static void main(String[] args) {
        TurnTrueFalse(10, 20);
        PositiveNegative(14);
        Negative(5);
        PrintRepetedLine("Hi", 5);
        LeapCommonYear(2022);
    }

    private static boolean TurnTrueFalse(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    private static void PositiveNegative(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    private static boolean Negative(int a) {
        return a < 0;
    }

    private static void PrintRepetedLine(String string, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(string);
        }
    }

    private static boolean LeapCommonYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
