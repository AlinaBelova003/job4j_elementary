package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double res1 = (height - 100) * 1.15;
        return res1;
    }

     public static double womenWeight(double height) {
        double res2 = (height - 110) * 1.15;
        return res2;
     }

     public static void main(String[] args) {
        double height = 189;
        double man = Fit.manWeight(height);
         System.out.println("Man 187 is " + man);
         double women = Fit.womenWeight(169);
         System.out.println("Women 169 is " + women);

    }
}
