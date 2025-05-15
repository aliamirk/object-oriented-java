class Booking {
    User user;
    Vehicle vehicle;
    Route route;
    int seatNumber;

    public Booking(User user, Vehicle vehicle, Route route, int seatNumber) {
        this.user = user;
        this.vehicle = vehicle;
        this.route = route;
        this.seatNumber = seatNumber;
    }

    public void display() {
        System.out.println("\n---- Booking Details --------------------");
        System.out.println("User Name     : " + user.getName());
        System.out.println("User ID       : " + user.getId());
        System.out.println("Vehicle ID    : " + vehicle.getVehicleId());
        System.out.println("Driver Name   : " + vehicle.getDriver());
        System.out.println("Route         : " + route.getStartLocation() + " to " + route.getEndLocation());
        System.out.println("Fare          : " + user.getFare(vehicle.isAC));
        System.out.println("Seat Number   : " + seatNumber);
        System.out.println("-------------------------");
    }

    @Override
    public String toString() {
        return user.getName() + "," + vehicle.getVehicleId() + "," +
                route.getStartLocation() + " to " + route.getEndLocation() + "," + seatNumber;
    }

}