package ru.job4j;

public class Multiple {
    public static void main(String[] args) {
        int i=1; {
            for (int j = 2; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}