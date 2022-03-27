package ru.job4j.arrey;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int prise) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int summa = money - prise;
        for (int i = 0; i < coins.length; i++) {
            while (coins[i] <= summa) {
                summa = summa - coins[i];
                result[size] = coins[i];
                size++;
            }
        }
        return Arrays.copyOf(result, size);

    }

    public static void main(String[] args) {

    }
}
