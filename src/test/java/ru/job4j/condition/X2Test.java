package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void whenA10B0C0X1then40() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int rs1 = X2.calk(a, b, c, x);
        Assert.assertEquals(expected, rs1);
    }

    @Test
    public void whenA1B1C1X1then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int res2 = X2.calk(a, b, c, x);
        Assert.assertEquals(expected, res2);
    }

    @Test
    public void whenA0B1C1X1then() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int res3 = X2.calk(a, b, c, x);
        Assert.assertEquals(expected, res3);
    }

    @Test
    public void whenA1B1C0X1then0() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int res4 = X2.calk(a, b, c, x);
        Assert.assertEquals(expected, res4);

    }

    @Test
    public void whenA1B1C1X0() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int res5 = X2.calk(a, b, c, x);
        Assert.assertEquals(expected, res5);

    }

    @Test
    public void main() {
    }
}