package com.tomgregory;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradleNewTest{
    @Test
    public void testDetermineGrade(){
    var grader = new GradleNew();
    assertEquals('F',grader.determinLetter(56));
    }
}