package Lab4;

public class Question7 {
    String projectName;
    String deadline;
    double budget;

    Question7() {
        this("Untitled Project", "Not Assigned", 0.0);
    }

    Question7(String projectName, String deadline) {
        this(projectName, deadline, 0.0);
    }

    Question7(String projectName, String deadline, double budget) {
        this.projectName = projectName;
        this.deadline = deadline;
        this.budget = budget;
    }

    void display() {
        System.out.println("Project Created: " + projectName + ", Deadline: " + deadline + ", Budget: $" + budget);
    }
}

class TestQ7 {
    public static void main(String[] args) {
        System.out.println("Creating Projects at Folio...");
        Question7 p1 = new Question7();
        Question7 p2 = new Question7("AI Chatbot", "30th June 2025");
        Question7 p3 = new Question7("E-Commerce Platform", "15th Dec 2025", 50000.0);

        p1.display();
        p2.display();
        p3.display();
    }
}
