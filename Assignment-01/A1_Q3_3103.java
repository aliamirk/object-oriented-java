package A01;

import java.util.ArrayList;
import java.util.Scanner;

// User class for storing user details
class User {
    private String name;
    private int age;
    private String licenseType;
    private String contactNumber;
    private int userId;

    public User(String name, int age, String licenseType, String contactNumber, int userId) {
        this.name = name;
        this.age = age;
        this.licenseType = licenseType;
        this.contactNumber = contactNumber;
        this.userId = userId;
    }

    public void updateDetails(String name, int age, String licenseType, String contactNumber) {
        this.name = name;
        this.age = age;
        this.licenseType = licenseType;
        this.contactNumber = contactNumber;
        System.out.println("User details for " + this.name + " updated successfully.");
    }

    public String getLicenseType() {
        return licenseType;
    }

    public int getUserId() {
        return userId;
    }

    public void displayUser() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("License Type: " + licenseType);
        System.out.println("Contact Number: " + contactNumber);
    }
}

// Vehicle class for storing vehicle details
class Vehicle {
    private String model;
    private double rentalPrice;
    private String requiredLicense;

    public Vehicle(String model, double rentalPrice, String requiredLicense) {
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.requiredLicense = requiredLicense;
    }

    public boolean isEligible(String userLicense) {
        // Learners can only rent Learner vehicles
        if (userLicense.equalsIgnoreCase("Learner") && !requiredLicense.equalsIgnoreCase("Learner")) {
            return false;
        }
        // Intermediate users can rent Intermediate and "Learner" vehicles
        if (userLicense.equalsIgnoreCase("Intermediate") && requiredLicense.equalsIgnoreCase("Full")) {
            return false;
        }
        return true; // Full license can rent all vehicles
    }

    public void displayVehicle() {
        System.out.println("Model: " + model + " | Rental Price: $" + rentalPrice + "/day | Required License: " + requiredLicense);
    }

    public String getModel() {
        return model;
    }
}

// Rental System class for managing users and vehicles
class RentalSystem {
    private ArrayList<User> users;
    private ArrayList<Vehicle> vehicles;
    private Scanner scanner;

    public RentalSystem() {
        users = new ArrayList<>();
        vehicles = new ArrayList<>();
        scanner = new Scanner(System.in);

        vehicles.add(new Vehicle("Toyota Corolla", 30.0, "Learner"));
        vehicles.add(new Vehicle("Honda Civic", 40.0, "Intermediate"));
        vehicles.add(new Vehicle("BMW X5", 80.0, "Full"));
    }

    public void registerUser() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter License Type (Learner, Intermediate, Full): ");
        String licenseType = scanner.nextLine();
        System.out.print("Enter Contact Number: ");
        String contactNumber = scanner.nextLine();

        int userId = users.size() + 1;
        User newUser = new User(name, age, licenseType, contactNumber, userId);
        users.add(newUser);
        System.out.println("User registered successfully! Your User ID is: " + userId);
    }

    public void updateUser() {
        System.out.print("Enter your User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine();
        User user = findUserById(userId);

        if (user != null) {
            System.out.print("Enter New Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter New Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter New License Type (Learner, Intermediate, Full): ");
            String licenseType = scanner.nextLine();
            System.out.print("Enter New Contact Number: ");
            String contactNumber = scanner.nextLine();

            user.updateDetails(name, age, licenseType, contactNumber);
        } else {
            System.out.println("User not found!");
        }
    }

    private User findUserById(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }
        }
        return null;
    }

    public void rentVehicle() {
        System.out.print("Enter your User ID: ");
        int userId = scanner.nextInt();
        scanner.nextLine();
        User user = findUserById(userId);

        if (user != null) {
            System.out.println("Available Vehicles:");
            for (int i = 0; i < vehicles.size(); i++) {
                System.out.print((i + 1) + ". ");
                vehicles.get(i).displayVehicle();
            }

            System.out.print("Select a vehicle by entering the number: ");
            int choice = scanner.nextInt();

            if (choice > 0 && choice <= vehicles.size()) {
                Vehicle selectedVehicle = vehicles.get(choice - 1);

                if (selectedVehicle.isEligible(user.getLicenseType())) {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Rental successful! You have rented: " + selectedVehicle.getModel());
                    System.out.println("-------------------------------------------------");
                } else {
                    System.out.println("-------------------------------------------------");
                    System.out.println("You are not eligible to rent this vehicle.");
                    System.out.println("-------------------------------------------------");
                }
            } else {
                System.out.println("Invalid selection.");
            }
        } else {
            System.out.println("User not found!");
        }
    }

    public void displayUsers() {
        System.out.println("\nRegistered Users:");
        for (User user : users) {
            user.displayUser();
            System.out.println("-----------------");
        }
    }

    public void displayVehicles() {
        System.out.println("\nAvailable Vehicles:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayVehicle();
        }
    }
}

// Main class
public class A1_Q3_3103 {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Vehicle Rental System ---");
            System.out.println("1. Register User");
            System.out.println("2. Update User Details");
            System.out.println("3. Rent a Vehicle");
            System.out.println("4. Display Users");
            System.out.println("5. Display Vehicles");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    rentalSystem.registerUser();
                    break;
                case 2:
                    rentalSystem.updateUser();
                    break;
                case 3:
                    rentalSystem.rentVehicle();
                    break;
                case 4:
                    rentalSystem.displayUsers();
                    break;
                case 5:
                    rentalSystem.displayVehicles();
                    break;
                case 6:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
