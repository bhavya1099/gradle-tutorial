

package com.tomgregory;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradleNewDeterminLetterTest {
    
    // Determines the corresponding letter grade for a given numeric grade.
    public char determinLetter(int numGrade) {
        if (numGrade < 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        } else if (numGrade < 60) {
            return 'F';
        } else if (numGrade < 69) {
            return 'D';
        } else if (numGrade < 80) {
            return 'C';
        } else {
            return 'O'; // Assuming 'O' stands for Outstanding or a similar high achievement.
        }
    }

    // Test to ensure negative grades throw an IllegalArgumentException.
    @Test(expected = IllegalArgumentException.class)
    public void testWithNegativeGrade() {
        determinLetter(-1);
    }

    // Test to verify that a grade of 0 correctly returns 'F'.
    @Test
    public void testWithZeroGrade() {
        assertEquals('F', determinLetter(0));
    }

    // Test to ensure 59, which is just below 60, correctly returns 'F'.
    @Test
    public void testWithGradeJustBelow60() {
        assertEquals('F', determinLetter(59));
    }

    // Test to verify that exactly 60, the lower boundary of 'D', returns 'D'.
    @Test
    public void testWithGradeAtLowerBoundaryOfD() {
        assertEquals('D', determinLetter(60));
    }

    // Test to ensure a perfect score of 100 returns 'O'.
    @Test
    public void testWithHighestPossibleGrade() {
        assertEquals('O', determinLetter(100));
    }

    // Test that a grade of 79, just below the 'C' threshold, correctly returns 'C'.
    @Test
    public void testWithGradeJustBelow80() {
        assertEquals('C', determinLetter(79));
    }
}
