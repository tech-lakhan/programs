package com.tech.poc.tdd;

import java.util.regex.Pattern;

public class StringCalculator {

    public static int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }
        String delimiter = ",";
        // Split the numbers using the delimiter
        String[] numArray = numbers.split(delimiter);
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
