package Lab10;

import java.util.Scanner;

// Custom Exception
class InvalidEstimateException extends Exception {
    public InvalidEstimateException(String message) {
        super(message);
    }
}

public class Question6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMuhammad Ali - 24K-3103\n");

        try {
            // Input
            System.out.print("Enter estimated hours for the task: ");
            String input = scanner.nextLine();

            // Check for null or empty input
            if (input == null || input.trim().isEmpty()) {
                throw new IllegalArgumentException("Error: Estimated hours cannot be null or empty.");
            }

            int estimatedHours;

            try {
                estimatedHours = Integer.parseInt(input.trim()); // Try parsing to integer
            } catch (NumberFormatException e) {
                System.out.println("Error: Estimated hours must be a numeric value (e.g., '10').");
                return;
            }

            // Check for logical bounds
            if (estimatedHours < 0 || estimatedHours > 100) {
                throw new InvalidEstimateException("Error: Estimated hours must be between 0 and 100.");
            }

            // Success message
            System.out.println("Estimated hours assigned successfully: " + estimatedHours + " hours");

        } catch (IllegalArgumentException | InvalidEstimateException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Estimation process completed.");
            scanner.close();
        }
    }
}
