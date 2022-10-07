package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

// Referenced class activity on Sept 29, 2022
public class ConverterApplicationTest {

    ConverterIf usingIfElse;
    ConverterSwitch usingSwitch;

    @Before
    public void setUp() {
        usingIfElse = new ConverterIf();
        usingSwitch = new ConverterSwitch();
    }

    @Test
    public void shouldReturnMonthWhenInputIsInRange() {
        assertEquals("February", usingIfElse.convertMonth(2));
        assertEquals("February", usingSwitch.convertMonth(2));
    }

    @Test
    public void shouldReturnDayWhenInputIsInRange() {
        assertEquals("Thursday", usingIfElse.convertDay(5));
        assertEquals("Thursday", usingSwitch.convertDay(5));
    }

    @Test
    public void shouldReturnMessageWhenInputIsInRange() {
        assertEquals("Please enter a number between 1 and 7.", usingIfElse.convertDay(0));
        assertEquals("Please enter a number between 1 and 7.", usingSwitch.convertDay(8));
        assertEquals("Please enter a number between 1 to 12.", usingIfElse.convertMonth(13));
        assertEquals("Please enter a number between 1 to 12.", usingIfElse.convertMonth(0));
    }
}