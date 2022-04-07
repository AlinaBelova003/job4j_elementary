package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when45to82then13() {
        Point a = new Point(4, 5);
        Point b = new Point(8, 2);
        double expected = 5.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when85to64then2dot2360() {
       Point a = new Point(8, 5);
       Point b = new Point(6, 4);
        double expected = 2.23606797749979;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}