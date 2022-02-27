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
    public void whenConverter1000RblThen16dot6666Dollar() {
        float in1 = 1000;
        float expected1 = (float) 16.666666;
        float out = Converter.rubelToDollars(in1);
        float ers = 0.0001f;
        Assert.assertEquals(expected1, out, ers);
    }
}