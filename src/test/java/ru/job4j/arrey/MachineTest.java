package ru.job4j.arrey;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MachineTest {

    @Test
    public void whenEquals() {
        int money = 100;
        int prise = 100;
        int[] expected = {};
        int[] result = Machine.change(money, prise);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when50be35() {
        int money = 50;
        int prise = 35;
        int[] expected = {10, 5};
        int[] result = Machine.change(money, prise);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when50by21() {
        int money = 50;
        int prise = 21;
        int[] expected = {10, 10, 5, 2, 2};
        int[] result = Machine.change(money, prise);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when50by32() {
        int money = 50;
        int prise = 32;
        int[] expected = {10, 5, 2, 1};
        int[] result = Machine.change(money, prise);
        Assert.assertArrayEquals(expected, result);
    }
}