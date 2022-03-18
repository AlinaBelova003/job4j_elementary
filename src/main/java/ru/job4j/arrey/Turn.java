package ru.job4j.arrey;

public class Turn {
    public static int[] back(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        int temp2 = array[1];
        array[1] = array[array.length - 2];
        array[array.length - 2] = temp2;

        for (int i : array) {
            System.out.println(i);
        }
        return array;
    }
 }

