package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrgAreaTest {

    @Test
    public void whenP8A3B2dot5C2dot5Square3() {
        double a = 3;
        double b = 2.5;
        double c = 2.5;
        int p = 8;
        double expected = 3.0;
        float exp = 0.00001f;
        double out = TrgArea.area(a, b, c);
        Assert.assertEquals(expected, out, exp);
    }

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenP7A5B4dot5C4dot5Square9dot354() {
        double a = 5;
        double b = 4.5;
        double c = 4.5;
        int p = 7;
        double expected = 9.354;
        double out = TrgArea.area(a, b, c);
        Assert.assertEquals(expected, out, 0.01);
    }
}