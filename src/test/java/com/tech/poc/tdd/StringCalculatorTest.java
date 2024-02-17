package com.tech.poc.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class StringCalculatorTest {

    @Test
    public void testAddEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }
   @Test
    public void testAddSingleNumber() {
        assertEquals(1, StringCalculator.add("1"));
    }

    @Test
    public void testAddTwoNumbers() {
        assertEquals(3, StringCalculator.add("1,2"));
    } @Test
    public void testAddMultipleNumbers() {
        assertEquals(15, StringCalculator.add("1,2,3,4,5"));
    }
    @Test
    public void testAddNewLineBetweenNumbers() {
        assertEquals(6, StringCalculator.add("1\n2,3"));
    }

    @Test
    public void testAddCustomDelimiter() {
        assertEquals(3, StringCalculator.add("//;\n1;2"));
    }
    @Test
    public void testAddNegativeNumbers() {
        try {
            StringCalculator.add("-1,2,-3");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative numbers not allowed: -1, -3", e.getMessage());
        }
    }
    @Test
    public void testAddNegativeNumbersWithCustomDelimiter() {
        try {
            StringCalculator.add("//;\n-1;2;-3");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Negative numbers not allowed: -1, -3", e.getMessage());
        }
    }
}
