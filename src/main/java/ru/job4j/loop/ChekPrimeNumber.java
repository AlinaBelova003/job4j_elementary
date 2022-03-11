package ru.job4j.loop;

public class ChekPrimeNumber {
    public static boolean check(int number) {
        for (int i = 2; i < number; i++) {
             if ((number % i) == 0) {
                 return false;
            }
        }
        return number > 1;
    }

    public static void main(String[] args) {
        System.out.println(check(5));

    }
}
