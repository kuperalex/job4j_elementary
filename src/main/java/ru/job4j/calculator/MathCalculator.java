package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }
    public static double minusAndDiv(double first, double second){
        return minus(first, second)
                + div(first, second);
    }

    public static double totalAmount(double first, double second){
        return sum(first, second) + multiply(first, second) + minusAndDiv(first, second);

    }


    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + minusAndDiv(10, 20));
        System.out.println("Результат расчета равен: " + totalAmount(10, 20));
    }
}