class Seat {
    boolean isFacultySeat;
    boolean isBooked;

    public Seat(boolean isFacultySeat) {
        this.isFacultySeat = isFacultySeat;
        this.isBooked = false;
    }

    public boolean isFacultySeat() {
        return isFacultySeat;
    }

    public void setFacultySeat(boolean facultySeat) {
        isFacultySeat = facultySeat;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}