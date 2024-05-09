
// ********RoostGPT********
/*

roost_feedback [5/9/2024, 4:33:21 PM]:write tests of all the use cases of the function

roost_feedback [5/9/2024, 4:37:47 PM]:add test for the case if number is less than 0
*/

// ********RoostGPT********

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
    public void testHighestDGrade() {
        assertEquals('D', determinLetter(69));
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
    public void testHighestCGrade() {
        assertEquals('C', determinLetter(89));
    }
    
    @Test
    public void testLowestBGrade() {
        assertEquals('B', determinLetter(90));
    }
    
    @Test
    public void testHighestBGrade() {
        assertEquals('B', determinLetter(99));
    }
    
    @Test
    public void testPerfectScore() {
        assertEquals('O', determinLetter(100));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAboveMaximumGrade() {
        determinLetter(101);
    }

    // Method under test
    public char determinLetter(int numGrade) {
        if (numGrade < 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        } else if (numGrade < 60) {
            return 'F';
        } else if (numGrade < 70) {
            return 'D';
        } else if (numGrade < 80) {
            return 'C';
        } else if (numGrade < 90) {
            return 'B';
        } else if (numGrade <= 100) {
            return 'O';
        } else {
            throw new IllegalArgumentException("Grades should not be over 100");
        }
    }
}
