

package com.tomgregory;

import org.junit.Test;
import static org.junit.Assert.*;

public class GradleNewDeterminLetterTest {
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeGradeInput() {
        determinLetter(-1);
    }
    @Test
    public void testGradeLessThanSixty() {
        assertEquals('F', determinLetter(59));
    }
    @Test
    public void testGradeInDRange() {
        assertEquals('D', determinLetter(65));
    }
    @Test
    public void testGradeInCRange() {
        assertEquals('C', determinLetter(75));
    }
    @Test
    public void testGradeOutOfDefinedRanges() {
        assertEquals('O', determinLetter(85));
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
        }
        return 'O';
    }
}
