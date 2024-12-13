package com.tomgregory;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SimpleCalculatorAddTest {
    public int add(int a, int b) {
        return a + b;
    }
    @Test
    public void basicAdditionTest() {
        // Arrange
        int a = 5;
        int b = 3;
        // Act
        int result = add(a, b);
        // Assert
        assertEquals(8, result);
    }
    @Test
    public void zeroAdditionTest() {
        // Arrange
        int a = 0;
        int b = 5;
        // Act
        int result = add(a, b);
        // Assert
        assertEquals(5, result);
    }
    @Test
    public void negativeNumbersAdditionTest() {
        // Arrange
        int a = -4;
        int b = -6;
        // Act
        int result = add(a, b);
        // Assert
        assertEquals(-10, result);
    }
    @Test
    public void mixedSignNumbersAdditionTest() {
        // Arrange
        int a = 7;
        int b = -2;
        // Act
        int result = add(a, b);
        // Assert
        assertEquals(5, result);
    }
    @Test
    public void largeNumbersAdditionTest() {
        // Arrange
        int a = Integer.MAX_VALUE;
        int b = 1;
        // Act
        int result = add(a, b);
        // Assert
        assertEquals(Integer.MIN_VALUE, result);
    }
    @Test
    public void symmetryTest() {
        // Arrange
        int a = 2;
        int b = 3;
        // Act
        int result1 = add(a, b);
        int result2 = add(b, a);
        // Assert
        assertEquals(result1, result2);
    }
}