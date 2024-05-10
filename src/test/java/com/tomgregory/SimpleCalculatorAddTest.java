

package com.tomgregory;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleCalculatorAddTest {
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
    public void additionWithZeroTest() {
        // Arrange
        int a = 0;
        int b = 7;
        // Act
        int result = add(a, b);
        // Assert
        assertEquals(7, result);
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
        int a = -8;
        int b = 3;
        // Act
        int result = add(a, b);
        // Assert
        assertEquals(-5, result);
    }
    @Test
    public void largeNumbersAdditionTest() {
        // Arrange
        int a = Integer.MAX_VALUE - 1;
        int b = 1;
        // Act
        int result = add(a, b);
        // This test may fail due to integer overflow which results in a value different from Integer.MAX_VALUE.
        // To handle large values correctly, consider using a data type that can handle overflow or implement a check for potential overflow conditions.
        assertEquals(Integer.MAX_VALUE, result);
    }
    // Method to be tested
    public int add(int a, int b) {
        return a + b;
    }
}
