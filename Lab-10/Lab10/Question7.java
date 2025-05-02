package Lab10;

import java.util.Scanner;

// Custom Exception
class BudgetOverflowException extends Exception {
    public BudgetOverflowException(String message) {
        super(message);
    }
}

public class Question7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int totalProjects = 5; // i have assumed 5 projects
        double totalBudget = 0;
        System.out.println("\nMuhammad Ali - 24K-3103\n");

        for (int i = 1; i <= totalProjects; i++) {
            try {
                System.out.print("Enter budget for project " + i + ": ");
                String input = scanner.nextLine();

                if (input == null || input.trim().isEmpty()) {
                    throw new IllegalArgumentException("Error: Budget input cannot be null or empty.");
                }

                double budget = Double.parseDouble(input.trim());

                if (budget > 10_000_000) {
                    throw new BudgetOverflowException("Error: Budget exceeds 10 million PKR for project " + i);
                }

                totalBudget += budget;
                System.out.println("Budget for project " + i + " accepted: PKR " + budget);

            } catch (NumberFormatException d) {
                System.out.println("Invalid input: " + d.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
            } catch (BudgetOverflowException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Budgeting round for project " + i + " completed.\n");
            }
        }

        System.out.println("Total accepted budget: PKR " + totalBudget);
        scanner.close();
    }
}
