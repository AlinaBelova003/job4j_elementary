package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double three = Math.pow(first, 2);
        double four = Math.pow(second, 0);
        double five = three + four;
        double six = Math.sqrt(five);
        System.out.println(six);
        return six;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println();
        double result2 = Point.distance(4, 5, 8, 2);
        System.out.println("Результат кардинатов (8, 4) и (2, 5) " + result2);
    }
}
