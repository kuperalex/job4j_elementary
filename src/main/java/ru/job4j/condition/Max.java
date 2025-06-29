package ru.job4j.condition;

public class Max {

    public static int printMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int printMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int printMax(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }
}
