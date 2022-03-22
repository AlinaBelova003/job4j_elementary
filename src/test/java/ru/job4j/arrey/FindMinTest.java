package ru.job4j.arrey;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMinTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[] {0, 5, 10};
        int expected = 0;
        int result = FindMin.findMin(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSecondMin() {
        int[] array = new int[] {10, 5, 3};
        int expected = 3;
        int result = FindMin.findMin(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMidlMin() {
        int[] array = new int[] {10, 2, 5};
        int expected = 2;
        int result = FindMin.findMin(array);
        Assert.assertEquals(expected, result);
    }
}