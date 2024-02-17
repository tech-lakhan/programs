package com.tech.poc.tdd;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    @Test
    public void testAddEmptyString() {
        assertEquals(0, StringCalculator.add(""));
    }

}
