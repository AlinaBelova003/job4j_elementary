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
    public void when854to645then2dot23() {
       Point a = new Point(8, 5, 4);
       Point b = new Point(6, 4, 5);
        double expected = 2.23;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when543to430Then1dot73() {
        Point a = new Point(5, 4, 3);
        Point b = new Point(4, 3, 0);
        double expected = 1.73;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}