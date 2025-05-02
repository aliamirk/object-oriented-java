package lab11;

import java.io.*;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("\nMuhammad Ali - 24K-3103\n");

        try {
            FileWriter writer = new FileWriter("projects.txt");
            writer.write("Project: PSL Website, Start Date: 2025-01-10, Manager: Ali Khan\n");
            writer.write("Project: Mobile App, Start Date: 2025-02-20, Manager: Talha Raza\n");
            writer.close();

            System.out.println("Initial 3 projects written to file.\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Reading all project details:");

        try {
            BufferedReader reader = new BufferedReader(new FileReader("projects.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        try {
            FileWriter writer = new FileWriter("projects.txt", true);
            writer.write("Project: Live Score Dashboard, Start Date: 2025-03-15, Manager: Usman Javed\n");
            writer.close();
            System.out.println("\n2 new projects appended to the file.");

        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }

        System.out.println("\nFinal Project List:");

        try {
            BufferedReader reader = new BufferedReader(new FileReader("projects.txt"));
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
