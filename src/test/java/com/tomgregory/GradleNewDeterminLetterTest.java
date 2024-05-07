

package com.tomgregory;
import org.junit.Test;
import static org.junit.Assert.*;

public class GradleNewDeterminLetterTest {
    
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

    @Test(expected = IllegalArgumentException.class)
    public void testWithNegativeGrade() {
        determinLetter(-1);
    }

    @Test
    public void testWithZeroGrade() {
        assertEquals('F', determinLetter(0));
    }

    @Test
    public void testWithGradeJustBelow60() {
        assertEquals('F', determinLetter(59));
    }

    @Test
    public void testWithGradeAtLowerBoundaryOfD() {
        assertEquals('D', determinLetter(60));
    }

    @Test
    public void testWithHighestPossibleGrade() {
        assertEquals('O', determinLetter(100));
    }

    @Test
    public void testWithGradeJustBelow80() {
        assertEquals('C', determinLetter(79));
    }
}
