package com.tomgregory;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.junit.Test;

public class GradleNewDeterminLetterTest {
    @Test
    public void testDeterminLetterForNegativeNumGrade() {
        int numGrade = -1;
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            determinLetter(numGrade);
        });
        assertEquals("Number must be greater than 0", exception.getMessage());
    }
    @Test
    public void testDeterminLetterForFailingNumGrade() {
        int numGrade = 50;
        char result = determinLetter(numGrade);
        assertEquals('F', result);
    }
    @Test
    public void testDeterminLetterForAverageNumGrade() {
        int numGrade = 65;
        char result = determinLetter(numGrade);
        assertEquals('D', result);
    }
    @Test
    public void testDeterminLetterForGoodNumGrade() {
        int numGrade = 75;
        char result = determinLetter(numGrade);
        assertEquals('C', result);
    }
    @Test
    public void testDeterminLetterForExcellentNumGrade() {
        int numGrade = 85;
        char result = determinLetter(numGrade);
        assertEquals('O', result);
    }
    private char determinLetter(int numGrade) {
        if (numGrade < 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        } else if (numGrade < 60) {
            return 'F';
        } else if (numGrade < 69) {
            return 'D';
        } else if (numGrade < 80) {
            return 'C';
        } else {
            return 'O';
        }
    }
}