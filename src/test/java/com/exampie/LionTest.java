package com.exampie;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void testGetKittens() throws Exception {

        Lion lion = new Lion("Самец",feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedGetKittens = 1;
        int actualGetKittens = lion.getKittens();
        assertEquals(expectedGetKittens, actualGetKittens);
    }

    @Test
    public void testGetFood() throws Exception{

        Lion lion = new Lion("Самка",feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualList = lion.getFood();
        assertEquals(expectedList, actualList);
    }

    @Test(expected = Exception.class)
    public void testLionThrowsException() throws Exception {
        new Lion("Нечто", feline);
    }
}
