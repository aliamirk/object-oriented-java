package Lab10;

import java.util.Scanner;

// Custom Exception
class InvalidOrderException extends Exception {
    public InvalidOrderException(String message) {
        super(message);
    }
}

public class Question8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMuhammad Ali - 24K-3103\n");

        try {
            System.out.print("Enter quantity of item: ");
            String quantityInput = scanner.nextLine();

            System.out.print("Enter price of item: ");
            String priceInput = scanner.nextLine();

            if (quantityInput == null || quantityInput.trim().isEmpty() ||
                    priceInput == null || priceInput.trim().isEmpty()) {
                throw new IllegalArgumentException("Error: Quantity or price cannot be null or empty.");
            }

            int quantity = Integer.parseInt(quantityInput.trim());
            double price = Double.parseDouble(priceInput.trim());

            if (quantity < 0 || quantity > 100) {
                throw new InvalidOrderException("Error: Quantity must be between 0 and 100.");
            }

            if (price < 0 || price > 50000) {
                throw new InvalidOrderException("Error: Price must be between 0 and 50000 PKR.");
            }

            double totalCost = quantity * price;
            System.out.println("Order placed successfully. Total cost: PKR " + totalCost);

        } catch (NumberFormatException e) {
            System.out.println("Error: Quantity and price must be numeric values.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (InvalidOrderException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Order processing finished for current item.");
        }

        scanner.close();
    }
}
