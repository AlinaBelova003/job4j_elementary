package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExistThenTrue() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);

    }

    @Test
    public void whenExistThenFalse() {
        double ac = 5.0;
        double ad = 3.0;
        double bc = 3.0;
        boolean result1 = Triangle.exist(ad, ac, bc);
        Assert.assertTrue(result1);
    }
}