package lab2.com;

import java.util.Scanner;


public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int noStudent = sc.nextInt();
        int sum = 0, pass = 0, fail;

        int[] grades = new int[noStudent];

        for (int i = 0; i < noStudent; i++) {
            System.out.println("Enter the grade for student " + (i + 1) + ":");
            int grade = sc.nextInt();
            grades[i] = grade;
        }

        for (int i = 0; i < noStudent; i++) {
            sum += grades[i];
            if (grades[i] >= 60){
                pass +=1;
            }
        }
        fail = noStudent - pass;
        float avgGrade = sum / noStudent;

        System.out.println("****** Output Results *******");
        System.out.println("Total Number of Students: " + noStudent);
        System.out.println("Average Grade: " + avgGrade);
        System.out.println("Number of Students Passed: " + pass);
        System.out.println("Number of Students Failed: " + fail);




    }
}
