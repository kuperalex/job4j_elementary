package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2.0;
        double output =  a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void  whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        double expected = 2.83;
        double output =  a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double expected = 5.66;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints123And468Then7() {
        Point a1 = new Point(1, 2, 3);
        Point b1 = new Point(4, 6, 8);
        double expected = 7.07;
        double output =  a1.distance3d(b1);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus3Minus23And468Then7() {
        Point a1 = new Point(-3, -2, 3);
        Point b1 = new Point(4, 6, 8);
        double expected = 11.75;
        double output =  a1.distance3d(b1);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus2Minus3And123Then7() {
        Point a1 = new Point(-1, -2, -3);
        Point b1 = new Point(1, 2, 3);
        double expected = 7.48;
        double output =  a1.distance3d(b1);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}