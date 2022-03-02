package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bs) {
        return ab + ac > bs && ac + bs > ab && bs + ab > ac;
    }

    public static void main(String[] args) {
        boolean ex1 = exist(2, 4, 2);
        System.out.println(ex1);

    }
}
