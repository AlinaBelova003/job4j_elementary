package ru.job4j.arrey;

public class EqLast {
    public static boolean check(int[] left, int[] right) {
        if (left[left.length - 1] != right[right.length - 1]) {
            return false;
        }
        return true;
    }
}