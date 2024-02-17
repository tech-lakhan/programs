package com.tech.poc.tdd;

import java.util.regex.Pattern;

public class StringCalculator {

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        // Handle both commas and new lines as delimiters
        String[] numArray = numbers.split("[,\n]");
        // Initialize sum
        int totalSum = 0;
        // Iterate through numbers
        for (String num : numArray) {
            if (!num.isEmpty()) {
                int numInt = Integer.parseInt(num);
                totalSum += numInt;
            }
        }
        return totalSum;
    }
}
