package com.example.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.mockito.Mock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private Lion lion;
    @Mock
    private Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        lion = new Lion("Самец", feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void testLionGetFood() throws Exception {
        lion = new Lion("Самец", feline);
        lion.getFood();
        Mockito.verify(feline).getFood(Mockito.anyString());
    }

    @Test
    public void testExceptionAndCheckText() {
        feline = new Feline();
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            new Lion("Неизвестно", feline);
        });
        Assert.assertEquals("Используйте допустимые значения пола животного - самей или самка", exception.getMessage());
    }
}