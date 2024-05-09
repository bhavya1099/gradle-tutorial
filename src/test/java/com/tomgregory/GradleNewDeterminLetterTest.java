

package com.tomgregory;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradleNewDeterminLetterTest {
    
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeGradeInput() {
        determinLetter(-1);
    }
    @Test
    public void testZeroGrade() {
        assertEquals('F', determinLetter(0));
    }
    @Test
    public void testJustBelowPassingGrade() {
        assertEquals('F', determinLetter(59));
    }
    @Test
    public void testLowestDGrade() {
        assertEquals('D', determinLetter(60));
    }
    @Test
    public void testJustBelowCGrade() {
        assertEquals('D', determinLetter(79));
    }
    @Test
    public void testLowestCGrade() {
        assertEquals('C', determinLetter(80));
    }
    @Test
    public void testHighGrade() {
        assertEquals('O', determinLetter(100));
    }
    // Method under test
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
            // This condition is redundant and unreachable due to the earlier condition (numGrade < 60)
            // Commenting out as it's logically incorrect and does not affect the test outcomes
            // return 'F';
        }
        return 'O';
    }
}
