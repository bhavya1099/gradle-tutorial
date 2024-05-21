package com.tomgregory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorAddTest {
    @Test
    public void testAddWithPositiveIntegers() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(3, calculator.add(1,2));
    }
    @Test
    public void testAddWithNegativeIntegers() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(-3, calculator.add(-1,-2));
    }
    @Test
    public void testAddWithPositiveAndNegativeInteger() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(1, calculator.add(-1,2));
    }
    @Test
    public void testAddWithZero() {
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(1, calculator.add(0,1));
    }
  
    @Test
    public void testAddWithMaxIntegers() {
        SimpleCalculator calculator = new SimpleCalculator();
        int MAX_INT = Integer.MAX_VALUE;
        assertEquals(-2, calculator.add(MAX_INT,MAX_INT));
    }
}