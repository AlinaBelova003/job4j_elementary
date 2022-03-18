package ru.job4j.arrey;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] array = {1, 2, 3, 4};
        int sours = 0;
        int dest = array.length - 1;
        int[] expected = {4, 2, 3, 1};
        int[] result = SwitchArray.swap(array, sours, dest);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap1To2() {
        int[] array = {1, 2, 3, 4};
        int sours = 1;
        int dest = array.length - 2;
        int[] expected = {1, 3, 2, 4};
        int[] result = SwitchArray.swap(array, sours, dest);
        Assert.assertArrayEquals(expected, result);
    }
}