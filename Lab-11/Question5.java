package lab11;

import java.io.*;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("\nMuhammad Ali - 24K-3103\n");

        try {
            FileWriter writer = new FileWriter("attendance.txt");
            writer.write("1. Ali\n");
            writer.write("2. Sana\n");

            writer.close();
            System.out.println("Attendance recorded for 5 employees.\n");

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("Present Employees:");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("attendance.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }

        try {
            FileWriter writer = new FileWriter("attendance.txt", true);
            writer.write("3. Zara (Late)\n");
            writer.write("4. Imran (Late)\n");
            writer.close();
            System.out.println("\nLate attendance recorded.\n");

        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }

        System.out.println("Final Attendance List:");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("attendance.txt"));
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
