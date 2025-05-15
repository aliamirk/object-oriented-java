class Faculty extends User implements FareCalculator {
    public Faculty(String name, String id, boolean hasPaid) {
        super(name, id, hasPaid);
    }

    public double calculateFare(boolean isAC) {
        return isAC ? 10000 : 8000;
    }

    @Override
    double getFare(boolean isAC) {
        return calculateFare(isAC);
    }
}