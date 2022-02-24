package ru.job4j.converter;

public class Converter {

    public static float rubelToEuro(float value) {
        return value / 70f;
    }

    public static float rubelToDollars(float value) {
        return value / 60f;
    }

    public static float euroToDollar(float value) {
        return value * 1.13f;
    }

    public static float dollarToEuro(float value) {
        return value * 0.88f;
    }

    public static void main(String[] args) {
        float euro = Converter.rubelToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubelToDollars(1000);
        System.out.println("1000 rubel are " + dollar + " dollar.");
    }
}
