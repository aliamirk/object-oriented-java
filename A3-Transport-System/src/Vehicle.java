import java.io.*;
import java.util.*;


abstract class Vehicle {
    String vehicleId;
    Driver driver;
    Route route;
    boolean isAC;
    ArrayList<Seat> seats;

    public Vehicle(String vehicleId, Driver driver, Route route, boolean isAC) {
        this.vehicleId = vehicleId;
        this.driver = driver;
        this.route = route;
        this.isAC = isAC;
        this.seats = new ArrayList<>();
    }

    abstract void createSeats();

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getDriver() {
        return driver.getName();
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public boolean isAC() {
        return isAC;
    }

    public void setAC(boolean AC) {
        isAC = AC;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }
}