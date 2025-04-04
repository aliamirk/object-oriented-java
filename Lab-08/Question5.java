
class Event {
    public void schedule() {
        System.out.println("General Event Schedule: Welcome note, Competition rounds, Result announcement.");
        System.out.println("--------------------------------------------------");
    }
}

class SpeedProgramming extends Event {
    @Override
    public void schedule() {
        System.out.println("Speed Programming Schedule:");
        System.out.println("- Round 1: Algorithmic Problems");
        System.out.println("- Round 2: Competitive Coding");
        System.out.println("- Final: On-the-spot Debugging Session");
        System.out.println("--------------------------------------------------");
    }
}

class WebDevelopment extends Event {
    @Override
    public void schedule() {
        System.out.println("Web Development Schedule:");
        System.out.println("- Design & Development Phase");
        System.out.println("- Presentation Session");
        System.out.println("- Live Demo to Judges");
        System.out.println("--------------------------------------------------");
    }
}

class AIChallenge extends Event {
    @Override
    public void schedule() {
        System.out.println("AI Challenge Schedule:");
        System.out.println("- Problem-Solving Phase");
        System.out.println("- AI Model Building");
        System.out.println("- AI Model Evaluation");
        System.out.println("--------------------------------------------------");
    }
}

class CyberSecurity extends Event {
    @Override
    public void schedule() {
        System.out.println("Cybersecurity Challenge Schedule:");
        System.out.println("- CTF-style Hacking Rounds");
        System.out.println("- Vulnerability Assessment Task");
        System.out.println("--------------------------------------------------");
    }
}

class BusinessCase extends Event {
    @Override
    public void schedule() {
        System.out.println("Business Case Competition Schedule:");
        System.out.println("- Market Analysis");
        System.out.println("- Strategy Development");
        System.out.println("- Pitch Presentations");
        System.out.println("--------------------------------------------------");
    }
}

// Main class to run the program
public class Question5 {
    public static void main(String[] args) {

        System.out.println("Ali - 24K-3103\n");

        Event[] events = new Event[5];
        events[0] = new SpeedProgramming();
        events[1] = new WebDevelopment();
        events[2] = new AIChallenge();
        events[3] = new CyberSecurity();
        events[4] = new BusinessCase();

        // Calling each event
        for (Event event : events) {
            event.schedule();
        }
    }
}
