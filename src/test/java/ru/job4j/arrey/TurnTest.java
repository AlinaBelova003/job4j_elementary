package ru.job4j.arrey;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] array = {4, 1, 6, 2};
        int[] expected = {2, 6, 1, 4};
        int[] result = Turn.back(array);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] result = Turn.back(array);
        Assert.assertArrayEquals(expected, result);

    }
}