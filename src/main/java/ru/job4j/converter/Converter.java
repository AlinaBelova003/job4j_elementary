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

        float in = 140;
        float expected = 2;
        float out = Converter.rubelToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        float in1 = 1000;
        float expected1 = (float) 16.666666;
        float out1 = Converter.rubelToDollars(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("1000 рублей равно 16 долларов : " + passed1);
    }
}
