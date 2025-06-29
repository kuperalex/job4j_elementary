package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void when5And10Max10() {
        int a = 5, b = 10;
        int expected = 10;
        int output = Max.printMax(a, b);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when7And3And11Max11() {
        int a = 7, b = 3, c = 11;
        int expected = 11;
        int output = Max.printMax(a, b, c);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when2And8And5And12Max12() {
        int a = 2, b = 8, c = 5, d = 12;
        int expected = 12;
        int output = Max.printMax(a, b, c, d);
        assertThat(output).isEqualTo(expected);
    }
}