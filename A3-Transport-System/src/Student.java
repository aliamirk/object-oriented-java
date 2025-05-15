class Student extends User implements FareCalculator {
    public Student(String name, String id, boolean hasPaid) {
        super(name, id, hasPaid);
    }

    public double calculateFare(boolean isAC) {
        return isAC ? 7000 : 5000;
    }

    @Override
    double getFare(boolean isAC) {
        return calculateFare(isAC);
    }
}