package ru.job4j.arrey;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] row = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int a = 0; a < size; a++) {
                int math = (i + 1) * (a + 1);
                row[i][a] = math;
            }
        }
        return row;
    }
}
