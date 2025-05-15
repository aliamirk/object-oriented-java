class Bus extends Vehicle {
    public Bus(String vehicleId, Driver driver, Route route, boolean isAC) {
        super(vehicleId, driver, route, isAC);
        createSeats();
    }

    void createSeats() {
        for (int i = 0; i < 52; i++) {
            seats.add(new Seat(i < 10)); // first 10 for faculty
        }
    }
}