package Lab10;

import java.util.Scanner;

// Custom Exception
class TooManyOversException extends Exception {
    public TooManyOversException(String message) {
        super(message);
    }
}

public class Question5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        int validOvers = 0;
        System.out.println("\nMuhammad Ali - 24K-3103\n");

        try {
            System.out.print("Enter number of overs to input (max 20): ");
            String overInput = scanner.nextLine();

            if (overInput == null || overInput.trim().isEmpty()) {
                System.out.println("Error: Number of overs cannot be null or empty.");
                return;
            }

            int overs = Integer.parseInt(overInput.trim());

            if (overs > 20) {
                throw new TooManyOversException("Error: Cannot input more than 20 overs.");
            }

            for (int i = 1; i <= overs; i++) {
                System.out.print("Enter runs scored in over " + i + ": ");
                String runInput = scanner.nextLine();

                try {
                    if (runInput == null || runInput.trim().isEmpty()) {
                        System.out.println("Error: Run input cannot be null or empty.");
                        continue;
                    }

                    int runs = Integer.parseInt(runInput.trim());
                    totalScore += runs;
                    validOvers++;

                } catch (NumberFormatException e) {
                    System.out.println("Invalid input for over " + i + ". Skipping entry (non-numeric value).");
                }
            }

            if (validOvers > 0) {
                double average = (double) totalScore / validOvers;
                System.out.println("Total score: " + totalScore);
                System.out.println("Average per over: " + average);
            } else {
                System.out.println("No valid over data to calculate score.");
            }

        } catch (TooManyOversException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Number of overs must be a valid number.");
        } finally {
            System.out.println("Score update completed.");
            scanner.close();
        }
    }
}
