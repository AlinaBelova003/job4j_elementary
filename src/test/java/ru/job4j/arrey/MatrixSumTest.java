package ru.job4j.arrey;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {

    @Test
    public void matrixSumTest() {
        int[][] array = {
                {10}
        };
        int result = MatrixSum.sum(array);
        int expected = 10;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTwo() {
        int[][] array = {
                {1, 2},
                {1, 2}
        };
        int expected = 6;
        int result = MatrixSum.sum(array);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTree() {
        int[][] array = {
                {1, 2, 1},
                {1, 2, 0}
        };
        int expected = 7;
        int result = MatrixSum.sum(array);
        Assert.assertEquals(expected, result);
    }
}