package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }

     public static double womenWeight(double height) {
        return  (height - 110) * 1.15;
     }

     public static void main(String[] args) {
        double height = 180;
        double man = Fit.manWeight(height);
         System.out.println("Man 180 is " + man);
         double women = Fit.womenWeight(170);
         System.out.println("Women 170 is " + women);

    }
}
