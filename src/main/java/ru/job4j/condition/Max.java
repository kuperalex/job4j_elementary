package ru.job4j.condition;

public class Max {

    public static int printMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int printMax(int a, int b, int c) {
        return printMax(a, printMax(b, c));
    }

    public static int printMax(int a, int b, int c, int d) {
        return printMax(printMax(a, b), printMax(c, d));
    }
}
