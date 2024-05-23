package com.example.tests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class FelineTest {
    private Feline feline;

    @Before
    public void setFeline() {
        feline = new Feline();
    }
    @Test
    public void testEatMeat() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testGetFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensWithOutArguments() {
        Assert.assertEquals(1, feline.getKittens());
    }
}
