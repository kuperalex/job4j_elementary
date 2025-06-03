package ru.job4j.converter;

public class Converter {

    static float rubleToEuro(float value) {
        return value / 70;
    }

    static float rubleToDollar(float value) {
        return value / 60 ;
    }
}
