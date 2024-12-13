package com.tomgregory;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradleNewDeterminLetterTest {
    @Test(expected = IllegalArgumentException.class)
    public void testWithNegativeNumberGrade() {
        determinLetter(-1);
    }
    @Test
    public void testWithZeroAsNumberGrade() {
        assertEquals('F', determinLetter(0));
    }
    @Test
    public void testWithGradeJustBelow60() {
        assertEquals('F', determinLetter(59));
    }
    @Test
    public void testWithGradeInTheDRange() {
        assertEquals('D', determinLetter(65));
    }
    @Test
    public void testWithGradeJustBelow80() {
        assertEquals('C', determinLetter(79));
    }
    @Test
    public void testWithGradeAbove80() {
        assertEquals('O', determinLetter(85));
    }
    public char determinLetter(int numGrade) {
        if (numGrade < 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        } else if (numGrade < 60) {
            return 'F';
        } else if (numGrade < 69) {
            return 'D';
        } else if (numGrade < 80) {
            return 'C';
        } else if (numGrade < 60) {
            return 'F';
        }
        return 'O';
    }
}