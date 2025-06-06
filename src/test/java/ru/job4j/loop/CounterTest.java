package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finis = 10;
        int result = Counter.sumByEven(start, finis);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromFiveToTwelveThenThirtySix() {
        int start = 5;
        int finis = 12;
        int result = Counter.sumByEven(start, finis);
        int expected = 36;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTenToTwentyThenThirtyNinety() {
        int start = 10;
        int finis = 20;
        int result = Counter.sumByEven(start, finis);
        int expected = 90;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusFiveToEightThenFourTeen() {
        int start = -5;
        int finis = 8;
        int result = Counter.sumByEven(start, finis);
        int expected = 14;
        assertThat(result).isEqualTo(expected);
    }
}