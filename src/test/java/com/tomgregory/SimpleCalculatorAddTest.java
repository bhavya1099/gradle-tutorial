package com.tomgregory;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleCalculatorAddTest {
    public int add(int a, int b) {
        return a + b;
    }
    @Test
    public void basicAddition() {
        // Arrange
        int a = 5;
        int b = 3;
        // Act
        int result = add(a, b);
        // Assert
        assertEquals(8, result);
    }
    @Test
    public void additionWithZero() {
        // Arrange
        int a = 7;
        int b = 0;
        // Act
        int result = add(a, b);
        // Assert
        assertEquals(7, result);
    }
    @Test
    public void additionWithNegativeNumbers() {
        // Arrange
        int a = -4;
        int b = -6;
        // Act
        int result = add(a, b);
        // Assert
        assertEquals(-10, result);
    }
    @Test
    public void additionResultingInZero() {
        // Arrange
        int a = 5;
        int b = -5;
        // Act
        int result = add(a, b);
        // Assert
        assertEquals(0, result);
    }
    @Test
    public void largeIntegerAddition() {
        // Arrange
        int a = Integer.MAX_VALUE - 1;
        int b = 1;
        // Act
        int result = add(a, b);
        // Assert
        assertEquals(Integer.MAX_VALUE, result);
    }
    @Test
    public void additionWithPositiveAndNegative() {
        // Arrange
        int a = 10;
        int b = -2;
        // Act
        int result = add(a, b);
        // Assert
        assertEquals(8, result);
    }
}