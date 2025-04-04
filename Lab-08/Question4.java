class Registration {

    public void register(String participantName, String category) {
        System.out.println("Single Participant Registered:");
        System.out.println("Name: " + participantName + ", Category: " + category);
        System.out.println("----------------------------------------------------");
    }

    public void register(String teamName, int numberOfMembers, String category) {
        System.out.println("Team Registered:");
        System.out.println("Team Name: " + teamName + ", Members: " + numberOfMembers + ", Category: " + category);
        System.out.println("----------------------------------------------------");
    }

    public void register(String universityName, int totalParticipants) {
        System.out.println("University-Wide Bulk Registration:");
        System.out.println("University: " + universityName + ", Total Participants: " + totalParticipants);
        System.out.println("----------------------------------------------------");
    }

    public void registerIndustryExpert(String expertName, String company, String expertise) {
        System.out.println("Industry Expert Registered:");
        System.out.println("Name: " + expertName + ", Company: " + company + ", Expertise: " + expertise);
        System.out.println("----------------------------------------------------");
    }

    public void registerVIP(String guestName, String designation) {
        System.out.println("VIP Guest Registered:");
        System.out.println("Name: " + guestName + ", Designation: " + designation);
        System.out.println("----------------------------------------------------");
    }
}

public class Question4 {
    public static void main(String[] args) {
        Registration reg = new Registration();
        System.out.println("Ali - 24K-3103\n");

        // Test 1: Single participant
        reg.register("Ali Amir", "Speed Programming");

        // Test 2: Team registration
        reg.register("CodeMasters", 4, "Web Development");

        // Test 3: University registration
        reg.register("FAST NUCES Karachi", 25);

        // Test 4: Industry expert registration
        reg.registerIndustryExpert("Sarah Ahmed", "Tech Solutions", "Cybersecurity");

        // Test 5: VIP guest registration
        reg.registerVIP("Dr. Atif", "Dean of Computing");
    }
}
