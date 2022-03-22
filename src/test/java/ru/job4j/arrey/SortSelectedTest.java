package ru.job4j.arrey;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArray0Of3elements() {
        int[] data = new int[] {3, 6, 2};
        int[] expected = {2, 3, 6};
        int[] result = SortSelected.sort(data);
        Assert.assertArrayEquals(expected, result);
    }
}