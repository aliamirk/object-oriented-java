package Lab10;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMuhammad Ali - 24K-3103\n");

        try {
            System.out.print("Enter the first number: ");
            String input1 = scanner.nextLine();

            System.out.print("Enter the second number: ");
            String input2 = scanner.nextLine();  // Read the second input as a string

            if (input1 == null || input1.trim().isEmpty() || input2 == null || input2.trim().isEmpty()) {
                throw new Exception("Error: Input cannot be empty.");
            }

            double num1 = Double.parseDouble(input1.trim());
            double num2 = Double.parseDouble(input2.trim());

            System.out.print("Enter the operation (+, -, *, /): ");
            String operation = scanner.nextLine();

            double result = 0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new Exception("Error: Cannot divide by zero.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new Exception("Error: Invalid operation. Please choose +, -, *, or /.");
            }

            System.out.println("The result of " + num1 + " " + operation + " " + num2 + " is: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Both inputs must be valid numbers.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
