package Lab10;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMuhammad Ali - 24K-3103\n");

        try {
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();  // Read the sentence

            if (sentence == null || sentence.trim().isEmpty()) {
                throw new Exception("Error: Input cannot be null or empty.");
            }

            // Split the sentence by space to count words
            String[] words = sentence.trim().split("\\s+");

            if (words.length < 2) {
                throw new Exception("Error: The sentence must contain at least two words.");
            }

            // If everything is valid then performing an operation

            String capitalized = sentence.toUpperCase();
            System.out.println("Capitalized Sentence: " + capitalized);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
