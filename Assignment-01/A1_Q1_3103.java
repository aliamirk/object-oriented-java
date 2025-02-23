package A01;

import java.util.ArrayList;

class Student {
    int studentID, age;
    String name, mentor;
    ArrayList<String> sportsInterests;

    Student(int id, int a, String n, String[] s){
        this.studentID = id;
        this.age = a;
        this.name = n;
        this.sportsInterests = new ArrayList<>();
    }

    public void registerforMentorship(Mentor m){
        this.mentor = m.name;
        System.out.println("Successfully Registered with Mentor: " + m.name + " ID: " + m.mentorID);
    };
    public void viewmentorDetails(){
        System.out.println("\nMentor Details");
        System.out.println("Registered with Mentor: " + mentor);
    };
    public void updatesportInterests(Sport s){
        sportsInterests.add(s.name);
        System.out.println("\nSports interests updated successfully..  added new sport" + s.name + " ID: " + s.sportID);
        System.out.println("Name: " + s.name + " ID: " + s.sportID);
        System.out.println("Description: " + s.desc);
    };

}

class Mentor {
    int mentorID, maxLearners;
    String name;
    ArrayList<String> sportsExpertise;
    ArrayList<String> asglearners;

    public Mentor(int mentorID, int maxLearners, String name) {
        this.mentorID = mentorID;
        this.maxLearners = maxLearners;
        this.name = name;
        this.sportsExpertise = new ArrayList<>();
        this.asglearners = new ArrayList<>();
    }

    public void assignLearner(Student s){
        if (asglearners.size() < maxLearners) {
            asglearners.add(s.name);
            System.out.println("Successfully added Learner: " + s.name + " ID: " + s.studentID);
        } else {
            System.out.println("\nMentor Capacity is full cannot add new learner !!!");
        }
    };
    public void removeLearner(Student s){
        boolean found = false;
        for (String learner : asglearners){
            if (learner == s.name){
                asglearners.remove(learner);
                System.out.println("\nSuccessfully removed Learner: " + s.name + " ID: " + s.studentID);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nNo such learner with Name: " + s.name + " exists");
        }
    };

    public void viewLearners(){
        System.out.println("\n Viewing Learners..");
        int i = 0;
        for (String learner : asglearners){
            System.out.println(i + ". Learner Name: " + learner + " Sport: " + sportsExpertise);
            i++;
        }
    }

    public void provideGuidance(){
        System.out.println("A dedicated mentor provides personalized guidance to young athletes, helping them refine their shooting technique, improve teamwork, and develop game strategies.");
    };

}

class Sport {
    int sportID;
    String name, desc;
    ArrayList<String> reqSkills;

    public Sport(int sportID, String name, String desc) {
        this.sportID = sportID;
        this.name = name;
        this.desc = desc;
        this.reqSkills = new ArrayList<>();
    }

    public void addSkill(Skill s){
        System.out.println("New Skill: " + s.name + " successfully added for sport: " + this.name);
        reqSkills.add(s.name);
    };

    public void removeSkill(Skill s){
        boolean found = false;
        for (String skill : reqSkills){
            if (skill == s.name){
                reqSkills.remove(skill);
                System.out.println("\nSuccessfully removed Skill: " + s.name + " for sport: " + this.name);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nNo such Skill with Name: " + s.name + " exists");
        }
    };
}

class Skill {
    int skillID;
    String name, desc;

    public Skill(int skillID, String name, String desc) {
        this.skillID = skillID;
        this.name = name;
        this.desc = desc;
    }

    public void showDetails(){
        System.out.println("\nSkill ID: " + this.skillID);
        System.out.println("Skill Name: " + this.name);
        System.out.println("Skill Description: " + this.desc);
    };
    public void updateSkill(String newDesc){
        this.desc = newDesc;
    };

}

public class A1_Q1_3103 {
    public static void main(String[] args) {

        System.out.println("Muhammad ALi - 24K 3103\n");
        // Creating a Sport
        Sport football = new Sport(102, "Soccer", "A sport where players score goals by kicking a ball into the opponent's net.");

        // Creating Skills
        Skill shooting = new Skill(202, "Shooting", "Precision in making baskets or scoring goals.");

        // Adding Skills to Sports
        football.addSkill(shooting);

        // Creating a Mentor
        Mentor coachAli = new Mentor(301, 2, "Coach Ali");
        Mentor coachEmma = new Mentor(302, 3, "Coach Emma");

        // Adding sports expertise for the mentor
        coachAli.sportsExpertise.add("Basketball");
        coachEmma.sportsExpertise.add("Football");

        // Creating Students
        String[] sports1 = {"Basketball"};
        String[] sports2 = {"Football"};

        Student student2 = new Student(402, 19, "Raza", sports2);
        Student student3 = new Student(403, 20, "Nadeem", sports1);

        // Assigning Students to Mentors
        coachAli.assignLearner(student3);
        coachEmma.assignLearner(student2);

        // Registering for Mentorship
        student2.registerforMentorship(coachEmma);

        // Viewing Mentor Details
        student2.viewmentorDetails();

        // Updating Sports Interests
        student2.updatesportInterests(football);

        // Viewing Learners of a Mentor
        coachAli.viewLearners();
        coachEmma.viewLearners();

        // Removing a Learner
        coachAli.removeLearner(student3);
        coachAli.viewLearners();

        // Providing Guidance
        coachAli.provideGuidance();
        coachEmma.provideGuidance();

        // Viewing Skill Details
        shooting.showDetails();

        // Updating a Skill
        shooting.updateSkill("Advanced ball handling techniques.");
    }
};