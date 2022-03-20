package ru.job4j.arrey;

public class PrintEvenElements {
    public static String printEvenInds(int[] numbers) {
        String ln = System.lineSeparator();
        String res = ("Элементы массива с чётными индексами, начиная с последнего: " + ln);

        for (int index = 0; index < numbers.length; index++) {

           if ((numbers.length - 1 - index) % 2 == 0) {
               res += numbers[numbers.length - 1 - index] + ln;
           }

        }
        return res;
    }
}
