package com.tech.poc.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Integer> negativeNumbers = new ArrayList();

        // Iterate through numbers
        for (String num : numArray) {
            if (!num.isEmpty()) {
                int numInt = Integer.parseInt(num);
                if (numInt < 0) {
                    negativeNumbers.add(numInt);
                } else {
                    totalSum += numInt;
                }
            }
        }
        if (!negativeNumbers.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " +
                    negativeNumbers.stream().map(Object::toString).collect(Collectors.joining(", ")));
        }
        return totalSum;
    }
}
