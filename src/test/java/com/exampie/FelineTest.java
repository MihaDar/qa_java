package com.exampie;

import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    Feline feline = new Feline();

    @Test

    public void testEatMeat() throws Exception{

        List<String> actualEatMeatList = feline.eatMeat();
        List<String> expectedEatMeatList = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedEatMeatList, actualEatMeatList);
    }

    @Test

    public void testGetFamily() throws Exception{

        String actualAnimalKind = feline.getFamily();
        String expectedAnimalKind = "Кошачьи";
        assertEquals(actualAnimalKind, expectedAnimalKind);
    }

    @Test

    public void testGetKittens() throws Exception{

        int actualKittens = feline.getKittens();
        int expectedKittens = 1;
        assertEquals(actualKittens, expectedKittens);
    }

    @Test

    public void testGetKittensCount() throws Exception{

        int actualKittensCount = feline.getKittens(3);
        int expectedKittensCount = 3;
        assertEquals(actualKittensCount, expectedKittensCount);
    }
}
