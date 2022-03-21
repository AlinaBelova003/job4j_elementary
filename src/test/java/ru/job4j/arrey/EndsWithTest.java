package ru.job4j.arrey;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue()  {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertTrue(result);
    }

    @Test
    public void whenEndWithPrefixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', '0'};
        char[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        Assert.assertFalse(result);
    }
}