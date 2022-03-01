package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax1To2then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax5To2then5() {
        int left = 5;
        int right = 2;
        int expected = 5;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax4to8then8() {
        int left = 4;
        int right = 8;
        int expected = 8;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenMax9To9then9() {
        int left = 9;
        int right = 9;
        int expected = 9;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

}