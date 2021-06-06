package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator calc;

    @Before
    public void setUp(){
        calc = new Calculator();
    }

    @Test
    public void shouldCalculateTwoIntegers() {
        assertEquals(2, calc.add(1,1));
        assertEquals(-29, calc.subtract(23, 52));
        assertEquals(68, calc.multiply(34,2));
        assertEquals(4, calc.divide(12,3));
        assertEquals(1, calc.divide(12, 7));
    }

    @Test
    public void shouldCalculateTwoDoubles() {
        assertEquals(5.7, calc.add(3.4, 2.3), 0.01);
        assertEquals(29.48, calc.multiply(6.7, 4.4), 0.01);
        assertEquals(5.0, calc.subtract(5.5, 0.5), 0.01);
        assertEquals(4.90, calc.divide(10.8, 2.2), 0.01);
    }

}