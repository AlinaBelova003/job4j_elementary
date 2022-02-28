package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double d = Math.sqrt(Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2));
        return d;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println();
        double result2 = Point.distance(4, 5, 8, 2);
        System.out.println("Результат кардинатов (8, 4) и (2, 5) " + result2);
        double result3 = Point.distance(8, 5, 6, 4);
        System.out.println("Результат кардинатов (8,6) и (5, 4) " + result3);
    }
}
