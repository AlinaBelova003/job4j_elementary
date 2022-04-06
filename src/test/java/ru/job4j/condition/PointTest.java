package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when45to82then13() {
        Point a = new Point(4, 5);
        Point b = new Point(2, 8);
        double expected = 13;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when85to64then3() {
       Point a = new Point(8, 5);
       Point b = new Point(6, 4);
        double expected = 3;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}