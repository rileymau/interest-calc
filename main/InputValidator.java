package main;

import java.util.InputMismatchException;

public class InputValidator {
    /**
     * Validates that a number is positive
     * The interest calculator only will work with positive inputs
     * Throws IllegalArgumentException if not positive
     */
    public static void validatePositive(double value, String fieldName) {
        if (value <= 0) {
            throw new IllegalArgumentException(fieldName + "must be greater than 0.");
        }
    }

    /**
     * Tries to parse a string into a double
     * Throws NumberFormatException if parsing fails
     */
    public static double parseDouble(String input, String fieldName) {
        try {
            double value = Double.parseDouble(input);
            validatePositive(value, fieldName);
            return value;
        } catch (NumberFormatException e) {
            throw new InputMismatchException("Invalid input for " + fieldName + ". Pleae enter a number.");
        }
    }
}
