package Lab10;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMuhammad Ali - 24K-3103\n");

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {

            if (input == null || input.trim().equals("")) {
                System.out.println("Error: Input is empty.");
                return;
            }

            int number = Integer.parseInt(input.trim());

            if (number < 0) {
                System.out.println("Error: Factorial is not defined for negative numbers.");
                return;
            }

            int result = Integer.parseInt(input);

            for (int i = result-1; i >= 1; i--) {
                // Check for overflow
                if (result > Integer.MAX_VALUE / i) {
                    System.out.println("Error: Factorial is too large to calculate.");
                    return;
                }
                result *= i;
            }

            System.out.println("Factorial of " + number + " is: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number.");
        }

        scanner.close();
    }
}
