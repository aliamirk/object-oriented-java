package lab11;

import java.io.*;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("\nMuhammad Ali - 24K-3103\n");

        try {
            FileWriter writer = new FileWriter("feedback.txt");
            writer.write("1. The food was amazing!\n");
            writer.write("2. Loved the ambiance, will visit again.\n");
            writer.close();
            System.out.println("Initial customer feedback recorded.\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Customer Feedback:");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("feedback.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        try {
            FileWriter writer = new FileWriter("feedback.txt", true);
            writer.write("3. The dessert was fantastic, highly recommend it!\n");
            writer.close();
            System.out.println("\nAdditional feedback recorded.\n");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }

        System.out.println("Final Customer Feedback:");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("feedback.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
