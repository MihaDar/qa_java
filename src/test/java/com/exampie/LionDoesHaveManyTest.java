package com.exampie;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionDoesHaveManyTest {
    private final String sex;
    private final boolean hasMane;

    public LionDoesHaveManyTest(String sex,boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getAnswer() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void testLionDoesHaveMany() throws Exception {

        Lion lion = new Lion(sex, new Feline());
        Lion lionSpy = Mockito.spy(lion);
        boolean actualDoesHaveMany = lionSpy.doesHaveMane();
        boolean expectedDoesHaveMany = hasMane;
        assertEquals(expectedDoesHaveMany, actualDoesHaveMany);
    }
}
