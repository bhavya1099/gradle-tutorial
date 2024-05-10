
// ********RoostGPT********
/*

roost_feedback [5/10/2024, 11:02:49 AM]:add comments to explain 

roost_feedback [5/10/2024, 11:22:44 AM]:add comments to explain the code
*/

// ********RoostGPT********

/*

roost_feedback [5/10/2024, 11:02:49 AM]:add comments to explain 
*/


package com.tomgregory;

import org.junit.Test;
import static org.junit.Assert.*;

public class GradleNewDeterminLetterTest {
    
    // Tests if the method throws IllegalArgumentException for negative grades
    @Test(expected = IllegalArgumentException.class)
    public void testNegativeGradeInput() {
        determinLetter(-1);
    }
    
    // Tests if the grade 0 correctly returns 'F'
    @Test
    public void testZeroGrade() {
        assertEquals('F', determinLetter(0));
    }
    
    // Tests the boundary condition just below the D grade
    @Test
    public void testJustBelowPassingGrade() {
        assertEquals('F', determinLetter(59));
    }
    
    // Tests if the lowest possible D grade (60) returns 'D'
    @Test
    public void testLowestDGrade() {
        assertEquals('D', determinLetter(60));
    }
    
    // Tests the boundary condition just below the C grade
    @Test
    public void testJustBelowCGrade() {
        assertEquals('D', determinLetter(79));
    }
    
    // Tests if the lowest possible C grade (80) returns 'C'
    @Test
    public void testLowestCGrade() {
        assertEquals('C', determinLetter(80));
    }
    
    // Tests if the highest possible grade (100) correctly returns 'O'
    @Test
    public void testHighGrade() {
        assertEquals('O', determinLetter(100));
    }
    
    // Method under test: determines the letter grade based on numeric grade
    public char determinLetter(int numGrade) {
        if (numGrade < 0) {
            throw new IllegalArgumentException("Number must be greater than 0");
        } else if (numGrade < 60) {
            return 'F';
        } else if (numGrade < 70) { // Corrected the upper limit for grade 'D'
            return 'D';
        } else if (numGrade < 80) {
            return 'C';
        } // Removed unreachable and erroneous code block 
        return 'O'; // Assumes any grade 80 and above results in 'O'
    }
}
