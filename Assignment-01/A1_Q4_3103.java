package A01;

import java.util.ArrayList;
import java.util.Scanner;

// Student class
class TStudent {
    private int studentId;
    private String name;
    private boolean transportCardActive;
    private String pickupStop;
    private String dropoffStop;

    public TStudent(int studentId, String name, String pickupStop, String dropoffStop) {
        this.studentId = studentId;
        this.name = name;
        this.transportCardActive = false; // Initially inactive
        this.pickupStop = pickupStop;
        this.dropoffStop = dropoffStop;
    }

    public void paySemesterFees() {
        this.transportCardActive = true;
        System.out.println(name + " has paid the fees. Transport card is now active.");
    }

    public void tapCard() {
        if (transportCardActive) {
            System.out.println(name + " tapped the card. Attendance recorded.");
        } else {
            System.out.println(name + " cannot tap the card. Fees not paid.");
        }
    }

    public int getStudentId() {
        return studentId;
    }

    public String getPickupStop() {
        return pickupStop;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId + ", Name: " + name + ", Pickup Stop: " + pickupStop);
    }
}

// BusStop class
class BusStop {
    private String stopName;
    private ArrayList<TStudent> studentsAtStop;

    public BusStop(String stopName) {
        this.stopName = stopName;
        this.studentsAtStop = new ArrayList<>();
    }

    public void addStudent(TStudent student) {
        studentsAtStop.add(student);
        System.out.println(student.getStudentId() + " assigned to " + stopName);
    }

    public void listStudents() {
        System.out.println("Students at " + stopName + ":");
        for (TStudent student : studentsAtStop) {
            student.displayStudentInfo();
        }
    }

    public String getStopName() {
        return stopName;
    }
}

// Route class
class Route {
    private int routeId;
    private ArrayList<BusStop> stops;

    public Route(int routeId) {
        this.routeId = routeId;
        this.stops = new ArrayList<>();
    }

    public void addStop(BusStop stop) {
        stops.add(stop);
    }

    public void displayStops() {
        System.out.println("Route " + routeId + " stops:");
        for (BusStop stop : stops) {
            System.out.println("- " + stop.getStopName());
        }
    }
}

// Transportation System class
class TransportationSystem {
    private ArrayList<TStudent> students;
    private ArrayList<Route> routes;
    private Scanner scanner;

    public TransportationSystem() {
        students = new ArrayList<>();
        routes = new ArrayList<>();
        scanner = new Scanner(System.in);

        // Adding sample routes and stops
        Route route1 = new Route(1);
        BusStop stopA = new BusStop("Stop A");
        BusStop stopB = new BusStop("Stop B");
        route1.addStop(stopA);
        route1.addStop(stopB);

        routes.add(route1);
    }

    public void registerStudent() {
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Pickup Stop: ");
        String pickupStop = scanner.nextLine();
        System.out.print("Enter Drop-off Stop: ");
        String dropoffStop = scanner.nextLine();

        TStudent student = new TStudent(studentId, name, pickupStop, dropoffStop);
        students.add(student);
        System.out.println(name + " registered successfully.");
    }

    public void payFees() {
        System.out.print("Enter Student ID: ");
        int studentId = scanner.nextInt();

        for (TStudent student : students) {
            if (student.getStudentId() == studentId) {
                student.paySemesterFees();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void recordAttendance() {
        System.out.print("Enter Student ID to record attendance: ");
        int studentId = scanner.nextInt();

        for (TStudent student : students) {
            if (student.getStudentId() == studentId) {
                student.tapCard();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void displayAllRoutes() {
        for (Route route : routes) {
            route.displayStops();
        }
    }
}

// Main class
public class A1_Q4_3103 {
    public static void main(String[] args) {
        TransportationSystem system = new TransportationSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Register Student\n2. Pay Fees\n3. Tap Card\n4. Display Routes\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    system.registerStudent();
                    System.out.println("Enter your ID to pay fees!");
                    system.payFees();
                case 2:
                    system.payFees();
                case 3:
                    system.recordAttendance();
                case 4:
                    system.displayAllRoutes();
                case 5: {
                    System.out.println("Exiting...");
                    return;
                }
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
