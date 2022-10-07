package com.company;

import org.junit.Test;

import static org.junit.Assert.*;
// referenced class activity on Sept 29, 2022
public class CalculatorTest {
    @Test
    public void shouldAddTwoIntegers(){
        Calculator calc = new Calculator();
        int actualResult = calc.add(4,3);
        int expectedResult = 7;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldSubtractTwoIntegers(){
        Calculator calc = new Calculator();
        int actualResult = calc.subtract(6,5);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldMultiplyTwoIntegers(){
        Calculator calc = new Calculator();
        int actualResult = calc.multiply(7,2);
        int expectedResult = 14;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void shouldDivideTwoIntegers(){
        Calculator calc = new Calculator();
        int actualResult = calc.divide(18,3);
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }
    double delta = 0.01;
    @Test
    public void shouldAddTwoDoubles(){
        Calculator calc = new Calculator();
        double actual = calc.add(5.1,3.6);
        double expected = 8.7;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void shouldSubtractTwoDoubles(){
        Calculator calc = new Calculator();
        double actual = calc.subtract(6.7,2.4);
        double expected = 5.3;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void shouldMultiplyTwoDoubles(){
        Calculator calc = new Calculator();
        double actual = calc.multiply(5.9,1.4);
        double expected = 8.26;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void shouldDivideTwoDoubles(){
        Calculator calc = new Calculator();
        double actual = calc.divide(9.3,2.1);
        double expected = 4.43;
        assertEquals(expected, actual, delta);
    }


}