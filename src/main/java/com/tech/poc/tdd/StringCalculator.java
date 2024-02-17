package com.tech.poc.tdd;

import java.util.regex.Pattern;

public class StringCalculator {

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String delimiter = ",";
        if (numbers.startsWith("//")) {
            String[] parts = numbers.split("\n", 2);
            delimiter = parts[0].substring(2); // Extract custom delimiter
            numbers = parts[1];
        }
        // Handle both the custom delimiter, commas, and new lines as delimiters
        String[] numArray = numbers.split("[" + delimiter + "\n]");

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
