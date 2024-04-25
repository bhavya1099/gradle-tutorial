
package com.tomgregory; 

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SimpleCalculatorTest{
    @Test
    public void twoPlusTwoShouldEqaulFour(){
        var calculator = new SimpleCalculator();
        int actual = calculator.add(2,3);
        
        int expected = 5;
        assertTrue(expected== actual);
    }

    @Test
    public void threePlusSevenShouldEqaulFour(){
        var calculator = new SimpleCalculator();
        int actual = calculator.add(7,3);
        
        int expected = 10;
        assertTrue(expected== actual);
    }
}