import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees to evaluate: ");
        int n = sc.nextInt();
        int[] sales = new int[n];
        int[] attendance = new int[n];
        String[] performance = new String[n];

        for (int i = 0; i < n; i++) {
            
            System.out.println("\nEmployee " + (i + 1) + ":");
            System.out.print("Enter monthly sales: ");
            sales[i] = sc.nextInt();
            System.out.print("Enter attendance percentage: ");
            attendance[i] = sc.nextInt();

            if (sales[i] > 10000) {
                if (attendance[i] > 90) performance[i] = "Outstanding";
                else if (attendance[i] >= 75) performance[i] = "Satisfactory";
                else performance[i] = "Needs Improvement";
            } else if (sales[i] >= 5000) {
                if (attendance[i] > 80) performance[i] = "Satisfactory";
                else performance[i] = "Needs Improvement";
            } else {
                performance[i] = "Needs Improvement";
            }

            System.out.println("Result: " + performance[i]);
        }

        System.out.println("\nFinal Report:");
        System.out.println("| Employee Number | Monthly Sales | Performance |");
        for (int i = 0; i < n; i++) {
            System.out.println("| " + (i + 1) + " | $" + sales[i] + " | " + performance[i] + " |");
        }
    }
}
