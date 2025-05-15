abstract class User {
    String name;
    String id;
    boolean hasPaid;

    public User(String name, String id, boolean hasPaid) {
        this.name = name;
        this.id = id;
        this.hasPaid = hasPaid;
    }

    abstract double getFare(boolean isAC);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isHasPaid() {
        return hasPaid;
    }

    public void setHasPaid(boolean hasPaid) {
        this.hasPaid = hasPaid;
    }
}