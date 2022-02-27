package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConverter140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubelToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConverter90RblThen1Dollar() {
        float in1 = 90;
        float expected1 = 1.5F;
        float out = Converter.rubelToDollars(in1);
        float ers = 0.0001f;
        Assert.assertEquals(expected1, out, ers);
    }
}