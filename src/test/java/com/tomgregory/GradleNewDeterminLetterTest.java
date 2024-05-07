package com.tomgregory;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradleNewDeterminLetterTest {
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeGrade() {
        determinLetter(-1);
    }
    @Test
    public void testGradeBelowSixty() {
        assertEquals('F', determinLetter(59));
    }
    @Test
    public void testGradeInDRange() {
        assertEquals('D', determinLetter(60));
        assertEquals('D', determinLetter(68));
    }
    @Test
    public void testGradeInCRange() {
        assertEquals('C', determinLetter(69));
        assertEquals('C', determinLetter(79));
    }
    @Test
    public void testGradeAboveDefinedCategories() {
        assertEquals('O', determinLetter(80));
        assertEquals('O', determinLetter(100)); // TODO: Change value to test with other grades above 79
    }
    // The method to be tested
    public char determinLetter(int numGrade) {
        if (numGrade < 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        } else if (numGrade < 60) {
            return 'F';
        } else if (numGrade < 69) {
            return 'D';
        } else if (numGrade < 80) {
            return 'C';
        }
        return 'O';
    }
}