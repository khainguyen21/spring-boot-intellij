package com.khaidevcode;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestStringTest {

    @Test
    void testFind_WithEmptyArray() {
        // Initialize the class
        LongestString longestString = new LongestString();

        // Test for an empty input array
        String[] input = {};
        String result = longestString.find(input);

        // Assert the result
        assertEquals("", result, "Expected output is an empty string for an empty array");
    }

    @Test
    void testFind_WithNullInput() {
        // Initialize the class
        LongestString longestString = new LongestString();

        // Test for null input
        String[] input = null;
        String result = longestString.find(input);

        // Assert the result
        assertEquals("", result, "Expected output is an empty string for null input");
    }

    @Test
    void testFind_WithNormalStrings() {
        // Initialize the class
        LongestString longestString = new LongestString();

        // Test for a normal array of strings
        String[] input = {"apple", "banana", "cherry"};
        String result = longestString.find(input);

        // Assert the result
        assertEquals("banana", result, "Expected output is the longest string in the array");
    }

    @Test
    void testFind_WithStringsOfEqualLength() {
        // Initialize the class
        LongestString longestString = new LongestString();

        // Test for strings of equal length
        String[] input = {"dog", "cat", "bat"};
        String result = longestString.find(input);

        // Assert the result
        assertEquals("dog", result, "Expected output is the first string of the longest length when lengths are equal");
    }

    @Test
    void testFind_WithNullValuesInArray() {
        // Initialize the class
        LongestString longestString = new LongestString();

        // Test for an array containing null values 
        String[] input = {"longerString", null, "short", null};
        String result = longestString.find(input);

        // Assert the result
        assertEquals("longerString", result, "Expected output is the longest non-null string in the array");
    }

    @Test
    void testFind_WithSingleElementArray() {
        // Initialize the class
        LongestString longestString = new LongestString();

        // Test for a single-element array
        String[] input = {"single"};
        String result = longestString.find(input);

        // Assert the result
        assertEquals("single", result, "Expected output is the only string in the single-element array");
    }

    @Test
    void testFind_WithArrayContainingEmptyStrings() {
        // Initialize the class
        LongestString longestString = new LongestString();

        // Test for an array containing empty strings
        String[] input = {"", "nonempty", ""};
        String result = longestString.find(input);

        // Assert the result
        assertEquals("nonempty", result, "Expected output is the non-empty longest string");
    }
}