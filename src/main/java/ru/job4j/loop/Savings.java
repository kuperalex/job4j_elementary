package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        double rate = percent / 100.0;

        do {
            total += total * rate;     // Начисление процентов
            total += annualDeposit;      // Пополнение вклада
            years++;
        } while (total < goal);
        return  years;
    }
}
