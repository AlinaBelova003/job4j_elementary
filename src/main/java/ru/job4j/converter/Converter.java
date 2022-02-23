package ru.job4j.converter;

public class Converter {

    public static float rubelToEuro(float value) {
        float rs1 = value / 70f;
        return rs1;
    }

    public static float rubelToDollars(float value) {
        float rs2 = value / 60f;
        return rs2;
    }
    //да, я прочитала, что оставлять комментарии это плохой тон, но только так я могу пока оставлять пояснения своим действиям))
    //два метода ниже я выполнила вне задания, просто хотела потренироваться и попрактиковать код.

    public static float euroToDollar(float value) {
        float rs3 = value * 1.13f;
        return rs3;
    }

    public static float dollarToEuro(float value) {
        float rs4 = value * 0.88f;
        return rs4;
    }

    public static void main(String[] args) {
        float euro = Converter.rubelToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubelToDollars(1000);
        System.out.println("1000 rubel are " + dollar + " dollar.");
    }
}
