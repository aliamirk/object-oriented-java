import java.io.*;
import java.util.*;

public class Main {

    // Defining  Lists to store transport data
    static Scanner scanner = new Scanner(System.in);
    static DataManager<User> users = new DataManager<>();
    static DataManager<Driver> drivers = new DataManager<>();
    static DataManager<Vehicle> vehicles = new DataManager<>();
    static DataManager<Route> routes = new DataManager<>();
    static DataManager<Booking> bookings = new DataManager<>();

    public static void main(String[] args) {

        //  Initiazling with some starting data
        try {
            Driver d1 = new Driver("Nadeem Naniwala", "L12345");
            Driver d2 = new Driver("Shahzad", "L67890");
            drivers.add(d1);
            drivers.add(d2);

            Route r1 = new Route("DHA Phase 2", "FAST-NU", 15);
            Route r2 = new Route("PECHS", "FAST-NU", 25);
            routes.add(r1);
            routes.add(r2);

            Vehicle v1 = new Bus("BUS001", d1, r1, true);
            Vehicle v2 = new Coaster("COA001", d2, r2, false);
            vehicles.add(v1);
            vehicles.add(v2);

            User u1 = new Student("Ali", "3103", true);
            User u2 = new Faculty("Dr. Minhal Raza", "F001", true);
            User u3 = new Student("Fatima", "3106", false);
            users.add(u1);
            users.add(u2);
            users.add(u3);

            Booking b1 = new Booking(u1, v1, r1, 1); // Ahmed books seat no 1 on BUS001
            Booking b2 = new Booking(u2, v2, r2,2); // Minhal Raza books seat no 2 on COA001
            bookings.add(b1);
            bookings.add(b2);
        } catch (Exception e) {
            System.out.println("Initialization error: " + e.getMessage());
        }
        boolean running = true;

        System.out.println("\nBuilt By ------------------------");
        System.out.println("24K-3103 --- Muhammad Ali");
        System.out.println("24K-3106 --- Abdullah Farhan");
        System.out.println("24K-3072 --- Asad Chotani");


        while (running) {
            System.out.println("\n--- Transport Management System -------");
            System.out.println("1. Register User");
            System.out.println("2. Add Driver");
            System.out.println("3. Add Route");
            System.out.println("4. Add Vehicle");
            System.out.println("5. Book Seat");
            System.out.println("6. View Bookings");
            System.out.println("7. Save bookings to file");
            System.out.println("8. Load bookings from file");
            System.out.println("9. Exit");
            System.out.println("---------------------------------------");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        registerUser();
                        break;
                    case 2:
                        addDriver();
                        break;
                    case 3:
                        addRoute();
                        break;
                    case 4:
                        addVehicle();
                        break;
                    case 5:
                        bookSeat();
                        break;
                    case 6:
                        viewBookings();
                        break;
                    case 7:
                        SaveDataToFile();
                        break;
                    case 8:
                        LoadDataFromFile();
                        break;
                    case 9:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option: Please Choose an option from (1 - 7): ");
                }
            } catch (Exception e) {
                System.out.println("Invalid Option Error: " + e.getMessage());
            }
        }
    }

    static void registerUser() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter ID: ");
        String id = scanner.nextLine();
        System.out.print("Have you paid? (true/false): ");
        boolean paid = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        scanner.nextLine();

        User user = isStudent ? new Student(name, id, paid) : new Faculty(name, id, paid);
        users.add(user);
        System.out.println("---------------------------------------");
        System.out.println("User has been registered successfully.");
    }

    static void addDriver() {
        System.out.print("Enter driver name: ");
        String name = scanner.nextLine();
        System.out.print("Enter license number: ");
        String license = scanner.nextLine();
        drivers.add(new Driver(name, license));
        System.out.println("---------------------------------------");
        System.out.println("Driver has been added successfully.");
    }

    static void addRoute() {
        System.out.print("Start location: ");
        String start = scanner.nextLine();
        System.out.print("End location: ");
        String end = scanner.nextLine();
        System.out.print("Distance (km): ");
        int distance = scanner.nextInt();
        scanner.nextLine();
        routes.add(new Route(start, end, distance));
        System.out.println("---------------------------------------");
        System.out.println("Route has been added successfully.");
    }

    static void addVehicle() throws EntityNotFoundException {
        System.out.print("Vehicle ID: ");
        String vid = scanner.nextLine();

        // Display available drivers
        System.out.println("Available Drivers:");
        for (int i = 0; i < drivers.getAll().size(); i++) {
            Driver d = drivers.get(i);
            System.out.println(i + ". " + d.getName());
        }
        System.out.print("\nChoose Driver Index: ");
        int dIndex = scanner.nextInt();

        // Display available routes
        System.out.println("Available Routes:");
        for (int i = 0; i < routes.getAll().size(); i++) {
            Route r = routes.get(i);
            System.out.println(i + ". " + r.getStartLocation() + " to " + r.getEndLocation());
        }
        System.out.print("\nChoose Route Index: ");
        int rIndex = scanner.nextInt();

        System.out.print("Is AC? (true/false): ");
        boolean isAC = scanner.nextBoolean();

        System.out.print("Is Bus? (true = Bus, false = Coaster): ");
        boolean isBus = scanner.nextBoolean();
        scanner.nextLine(); // to avoid incorrect input

        Driver driver = drivers.get(dIndex);
        Route route = routes.get(rIndex);

        Vehicle vehicle = isBus ? new Bus(vid, driver, route, isAC) : new Coaster(vid, driver, route, isAC);
        vehicles.add(vehicle);
        System.out.println("---------------------------------------");
        System.out.println("Vehicle has been added successfully.");
    }


    static void bookSeat() throws EntityNotFoundException {
        // Display available users
        System.out.println("Available Users:");
        for (int i = 0; i < users.getAll().size(); i++) {
            User u = users.get(i);
            System.out.println(i + ". " + u.getName());
        }
        System.out.print("\nChoose User Index: ");
        int uIndex = scanner.nextInt();

        // Display available vehicles
        System.out.println("Available Vehicles:");
        for (int i = 0; i < vehicles.getAll().size(); i++) {
            Vehicle v = vehicles.get(i);
            System.out.println(i + ". " + v.getVehicleId() + " | Driver: " + v.getDriver() +
                    " | Route: " + v.getRoute().getStartLocation() + " to " + v.getRoute().getEndLocation());
        }
        System.out.print("\nChoose Vehicle Index: ");
        int vIndex = scanner.nextInt();

        // Display available routes
        System.out.println("Available Routes:");
        for (int i = 0; i < routes.getAll().size(); i++) {
            Route r = routes.get(i);
            System.out.println(i + ". " + r.getStartLocation() + " to " + r.getEndLocation() + " |");
        }
        System.out.print("\nChoose Route Index: ");
        int rIndex = scanner.nextInt();

        // Seat number
        System.out.print("Enter Seat Number: ");
        int seatNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create and add booking
        Booking booking = new Booking(
                users.get(uIndex),
                vehicles.get(vIndex),
                routes.get(rIndex),
                seatNumber
        );

        bookings.add(booking);
        System.out.println("---------------------------------------");
        System.out.println("Booking added successfully.");
    }


    static void viewBookings() {
        for (Booking b : bookings.list) {
            b.display();
        }
    }

    static void SaveDataToFile() {
        try {
            String data = "";
            for (Booking booking : bookings.getAll()) {
                data += booking.toString() + "\n";
            }

            FileManage.saveToFile("bookings.txt", data);
            System.out.println("---------------------------------------");
            System.out.println("Bookings saved to bookings.txt");
        } catch (IOException e) {
            System.out.println("Error saving bookings: " + e.getMessage());
        }
    }



    static void LoadDataFromFile() {
        try {
            List<String> lines = FileManage.loadFromFile("bookings.txt");
            System.out.println("---------------------------------------");
            System.out.println("Bookings loaded from bookings.txt:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error loading bookings: " + e.getMessage());
        }
    }


}
