package ru.job4j.arrey;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int prise) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int change = money - prise;
        for (int coin : coins) {
            while (coin <= change) {
                change = change - coin;
                result[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
