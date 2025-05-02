package lab11;

import java.util.ArrayList;

class Issue<T> {
    T issueDetail;

    public Issue(T issueDetail) {
        this.issueDetail = issueDetail;
    }

    public void display() {
        System.out.println("Issue: " + issueDetail);
    }
}

public class Question1 {
    public static void main(String[] args) {

        System.out.println("\nMuhammad Ali - 24K-3103\n");
        ArrayList<Issue<String>> issues = new ArrayList<>();

        // Create objects for different issues separately
        Issue<String> techIssue = new Issue<>("Technical Issue: Server Down");
        Issue<String> hrIssue = new Issue<>("HR Issue: Salary Query");
        Issue<String> adminIssue = new Issue<>("Admin Issue: Office Supplies Shortage");

        issues.add(techIssue);
        issues.add(hrIssue);
        issues.add(adminIssue);

        System.out.println("Reported Issues:");
        for (Issue<String> issue : issues) {
            issue.display();
        }
    }
}
