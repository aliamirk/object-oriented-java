package lab11;

import java.util.ArrayList;

class AdmissionRecord<T> {
    T detail;

    public AdmissionRecord(T detail) {
        this.detail = detail;
    }

    public void display() {
        System.out.println("Detail: " + detail);
    }
}

public class Question2 {
    public static void main(String[] args) {
        System.out.println("\nMuhammad Ali - 24K-3103\n");

        ArrayList<AdmissionRecord<String>> nameRecords = new ArrayList<>();
        ArrayList<AdmissionRecord<Double>> scoreRecords = new ArrayList<>();

        AdmissionRecord<String> student1Name = new AdmissionRecord<>("Ali Khan");
        AdmissionRecord<String> student2Name = new AdmissionRecord<>("Sara Ahmed");

        AdmissionRecord<Double> student1Score = new AdmissionRecord<>(87.5);
        AdmissionRecord<Double> student2Score = new AdmissionRecord<>(91.0);

        nameRecords.add(student1Name);
        nameRecords.add(student2Name);
        scoreRecords.add(student1Score);
        scoreRecords.add(student2Score);

        System.out.println("Student Names:");
        for (AdmissionRecord<String> name : nameRecords) {
            name.display();
        }

        System.out.println("\nEntry Test Scores:");
        for (AdmissionRecord<Double> score : scoreRecords) {
            score.display();
        }
    }
}
