package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K9Square2dot25() {
        int p = 10;
        int k = 9;
        double expected = 2.25;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenP60K29Square29() {
        int p = 60;
        int k = 29;
        double expected = 29;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);

    }
}