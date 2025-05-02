package lab11;


import java.io.*;
import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {
        System.out.println("\nMuhammad Ali - 24K-3103\n");
        String sourceFile = "/Users/apple/IdeaProjects/Lab-11/src/lab11/source.txt";
        String destinationFile = "destination.txt";

        try {
            copyFile(sourceFile, destinationFile);
        } catch (IOException e) {
            System.out.println("Error occurred while copying file: " + e.getMessage());
        }
    }

    public static void copyFile(String sourceFile, String destinationFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Source file not found. Please provide a new source file name:");
            Scanner scanner = new Scanner(System.in);
            sourceFile = scanner.nextLine();
            copyFile(sourceFile, destinationFile);
        } catch (IOException e) {
            throw new IOException("Failed to copy the file: " + e.getMessage(), e);
        }
    }
}
