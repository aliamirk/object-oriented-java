class Coaster extends Vehicle {
    public Coaster(String vehicleId, Driver driver, Route route, boolean isAC) {
        super(vehicleId, driver, route, isAC);
        createSeats();
    }

    void createSeats() {
        for (int i = 0; i < 32; i++) {
            seats.add(new Seat(i < 6)); // first 6 for faculty
        }
    }
}