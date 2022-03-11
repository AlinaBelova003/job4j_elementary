package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChekPrimeNumberTest {

    @Test
    public void when5() {
        int number = 5;
        boolean expected = true;
        boolean result = ChekPrimeNumber.check(number);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when4() {
        int number = 4;
        boolean result = ChekPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

    @Test
    public void when1() {
        int number = 1;
        boolean result = ChekPrimeNumber.check(number);
        Assert.assertFalse(result);
    }

}