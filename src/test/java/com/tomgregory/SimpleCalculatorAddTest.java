

package com.tomgregory;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleCalculatorAddTest {
    public int add(int a, int b) {
        return a + b;
    }
    
    @Test
    public void basicAddition() {
        int a = 5;
        int b = 3;
        int expected = 8;
        int result = add(a, b);
        assertEquals(expected, result);
    }
    
    @Test
    public void additionWithNegativeNumbers() {
        int a = -4;
        int b = -6;
        int expected = -10;
        int result = add(a, b);
        assertEquals(expected, result);
    }
    
    @Test
    public void additionWithZero() {
        int a = 7;
        int b = 0;
        int expected = 7;
        int result = add(a, b);
        assertEquals(expected, result);
    }
    
    @Test
    public void additionResultingInOverflow() {
        int a = Integer.MAX_VALUE;
        int b = 1;
        int expected = Integer.MIN_VALUE; // Overflow will wrap around to Integer.MIN_VALUE
        int result = add(a, b);
        assertEquals(expected, result);
    }
    
    @Test
    public void additionOfMaximumIntegers() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int expected = -2; // 0xfffffffe, overflow condition
        int result = add(a, b);
        assertEquals(expected, result);
    }
}
