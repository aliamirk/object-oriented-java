package lab11;

import java.io.*;
import java.util.*;

class InvalidEmployeeRecordException extends Exception {
    public InvalidEmployeeRecordException(String message) {
        super(message);
    }
}

class Employee {
    private int employeeID;
    private String name;
    private double salary;

    public Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeID: " + employeeID + ", Name: " + name + ", Salary: " + salary;
    }
}

public class Question7 {
    public static void main(String[] args) {
        String fileName = "/Users/apple/IdeaProjects/Lab-11/src/lab11/employee_records.txt";
        List<Employee> validEmployees = new ArrayList<>();
        System.out.println("\nMuhammad Ali - 24K-3103\n");


        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = reader.readLine()) != null) {
                try {
                    String[] parts = line.split(",");

                    if (parts.length != 3) {
                        throw new InvalidEmployeeRecordException("Invalid record format: " + line);
                    }

                    int employeeID = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    double salary = Double.parseDouble(parts[2].trim());

                    validEmployees.add(new Employee(employeeID, name, salary));

                } catch (InvalidEmployeeRecordException | NumberFormatException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            reader.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: The file was not found.");
        } catch (IOException e) {
            System.out.println("Error: An error occurred.");
        }

        System.out.println("\nValid Employee Records:");
        for (Employee employee : validEmployees) {
            System.out.println(employee);
        }

        System.out.println("\nEmployee record processing completed.");
    }
}
