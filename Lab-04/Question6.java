package Lab4;

class Employee {
    protected String name;
    protected int id;
    protected String department;

    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;

        System.out.println("Employee Constructor: " + name + " (ID: " + this.id + ") from " + this.department);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, String department, int teamSize) {
        super(name, id, department);
        this.teamSize = teamSize;
        System.out.println("Manager Constructor: Manages " + this.teamSize + " team members");

    }
}

 class RoleBasedAccessControl {
    public static void main(String[] args) {
        Manager manager = new Manager("Ali", 101, "IT", 5);
    }
}

