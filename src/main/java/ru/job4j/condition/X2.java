package ru.job4j.condition;

public class X2 {
    public static int calk(int a, int b, int c, int x) {
        return a * x * x + b * x + c;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int rs1 = X2.calk(a, b, c, x);
        System.out.println(rs1);
    }
}
