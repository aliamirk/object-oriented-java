
class Employee_ {
    protected String name;
    protected String role;

    public Employee_(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public void evaluatePerformance() {
        System.out.println(name + " is evaluated based on general performance criteria.");
    }

    // Overloaded method to include additional evaluation factors
    public void evaluatePerformance(int completedProjects) {
        System.out.println(name + " is evaluated based on " + completedProjects + " completed projects.");
    }

    public void evaluatePerformance(int completedProjects, int codeQuality) {
        System.out.println(name + " is evaluated based on " + completedProjects
                + " completed projects and code quality score: " + codeQuality);
    }

    public void evaluatePerformance(int completedProjects, int codeQuality, int clientFeedback) {
        System.out.println(name + " is evaluated based on " + completedProjects
                + " completed projects, code quality: " + codeQuality
                + ", and client feedback: " + clientFeedback);
    }
}

class JuniorDeveloper extends Employee_ {
    public JuniorDeveloper(String name) {
        super(name, "Junior Developer");
    }

    @Override
    public void evaluatePerformance() {
        System.out.println(role + " " + name + " is evaluated based on code quality and project completion.");
    }
}

class SeniorDeveloper extends Employee_ {
    public SeniorDeveloper(String name) {
        super(name, "Senior Developer");
    }

    @Override
    public void evaluatePerformance() {
        System.out.println(role + " " + name + " is evaluated based on team contributions and leadership.");
    }
}

class projectManager extends Employee_ {
    public projectManager(String name) {
        super(name, "Project Manager");
    }

    @Override
    public void evaluatePerformance() {
        System.out.println(role + " " + name + " is evaluated based on project success rate and team efficiency.");
    }
}

public class Question7 {
    public static void main(String[] args) {
        System.out.println("Ali - 24K-3103\n");

        Employee_ emp1 = new Employee_("Talha Shahid", "Developer");
        Employee_ emp2 = new Employee_("Minhal Raza", "Developer");
        Employee_ emp3 = new Employee_("Muhammad Monis", "Developer");
        JuniorDeveloper jd = new JuniorDeveloper("Talha Shahid");
        SeniorDeveloper sd = new SeniorDeveloper("Minhal Raza");
        projectManager pm = new projectManager("Muhammad Monis");

        emp1.evaluatePerformance(5);
        emp2.evaluatePerformance(8, 9);
        emp3.evaluatePerformance(10, 8, 9);

        jd.evaluatePerformance();
        sd.evaluatePerformance();
        pm.evaluatePerformance();
    }
}
