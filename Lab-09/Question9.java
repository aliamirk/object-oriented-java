
abstract class UberRide {
    String rideId;
    double distance; // in km
    double baseFare;

    public UberRide(String rideId, double distance, double baseFare) {
        this.rideId = rideId;
        this.distance = distance;
        this.baseFare = baseFare;
    }

    abstract double calculateFare();
    abstract void dispatchDriver();

    public void printReceipt() {
        System.out.println("Ride ID: " + rideId);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Base Fare: $" + baseFare);
    }
}

class UberX extends UberRide {
    public UberX(String rideId, double distance, double baseFare) {
        super(rideId, distance, baseFare);
    }

    @Override
    double calculateFare() {
        double fare = baseFare + (distance * 1.5); // base + per km
        return fare;
    }

    @Override
    void dispatchDriver() {
        System.out.println("Dispatching UberX driver...");
    }
}

class UberBlack extends UberRide {
    public UberBlack(String rideId, double distance, double baseFare) {
        super(rideId, distance, baseFare);
    }

    @Override
    double calculateFare() {
        double luxurySurcharge = 20.0;
        double fare = baseFare + (distance * 3.0) + luxurySurcharge;
        return fare;
    }

    @Override
    void dispatchDriver() {
        System.out.println("Dispatching UberBlack driver...");
    }
}

class UberXL extends UberRide {
    public UberXL(String rideId, double distance, double baseFare) {
        super(rideId, distance, baseFare);
    }

    @Override
    double calculateFare() {
        double surgeMultiplier = 1.75;
        double fare = (baseFare + (distance * 2.0)) * surgeMultiplier;
        return fare;
    }

    @Override
    void dispatchDriver() {
        System.out.println("Dispatching UberXL driver...");
    }
}

class RideAnalytics {
    public static void analyzeRide(UberRide ride) {
        System.out.println("\n--- Ride Analysis ---");
        if (ride instanceof UberX) {
            System.out.println("Ride Type: UberX");
        } else if (ride instanceof UberBlack) {
            System.out.println("Ride Type: UberBlack");
        } else if (ride instanceof UberXL) {
            System.out.println("Ride Type: UberXL");
        }
        System.out.println("Calculated Fare: $" + ride.calculateFare());
    }
}

public class Question9 {
    public static void main(String[] args) {
        System.out.println("Muhammad Ali - 24K-3103");
        UberRide ride1 = new UberX("X123", 10, 5);
        UberRide ride2 = new UberBlack("B456", 8, 10);
        UberRide ride3 = new UberXL("XL789", 15, 7);

        UberRide[] rides = {ride1, ride2, ride3};

        for (UberRide ride : rides) {
            System.out.println("\n--- Ride Receipt ---");
            ride.printReceipt();
            System.out.println("Total Fare: $" + ride.calculateFare());
            ride.dispatchDriver();
        }

        for (UberRide ride : rides) {
            RideAnalytics.analyzeRide(ride);
        }
    }
}
