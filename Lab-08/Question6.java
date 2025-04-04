
class Employee {
    protected String name;
    protected String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void assignTask(String taskName) {
        System.out.println(role + " " + name + " is assigned task: " + taskName);
    }

    public void assignTask(String taskName, int priority) {
        System.out.println(name + " is assigned task: " + taskName + " with priority: " + priority);
    }

    public void assignTask(String taskName, int priority, int estimatedTime) {
        System.out.println(name + " is assigned task: " + taskName + " with priority: " + priority
                + " and estimated time: " + estimatedTime + " hours.");
    }
}

class Developer extends Employee {
    public Developer(String name) {
        super(name, "Developer");
    }

    public void codeTask(String taskName) {
        System.out.println(role + " " + name + " is coding the task: " + taskName);
    }
}

class TeamLead extends Employee {
    public TeamLead(String name) {
        super(name, "Team Lead");
    }

    @Override
    public void assignTask(String taskName) {
        System.out.println(role + " " + name + " is reviewing and approving task: " + taskName);
    }
}

class ProjectManager extends Employee {
    public ProjectManager(String name) {
        super(name, "Project Manager");
    }

    public void assignUrgentTask(String taskName) {
        System.out.println(role + " " + name + " has assigned an urgent task: " + taskName + " with custom deadline.");
    }
}

public class Question6 {
    public static void main(String[] args) {
        System.out.println("Ali - 24K-3103\n");

        Developer dev = new Developer("Muhammad Nadeem Ghouri");
        TeamLead lead = new TeamLead("Minhal Raza");
        // ProjectManager pm1 = new ProjectManager("Muhammad Monis");

        dev.codeTask("Bug Fixing");
        dev.assignTask("Feature Development", 2);
        dev.assignTask("Refactoring", 1, 5);

        lead.assignTask("Code Review");

    }
}
