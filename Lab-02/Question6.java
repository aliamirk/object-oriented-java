import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String username, password;
        double balance = 0;

        System.out.println("Enter username: ");
        username = sc.next();
        System.out.println("Enter password: ");
        password = sc.next();

        if (username.equals("Nadeem") && password.equals("xyz123")) {
            System.out.println("Login successful! Welcome, " + username + "!");
           
            while (true) {
                System.out.println("1. Deposit Money\n2. Withdraw Amount\n3. Account Status");
                System.out.println("Select your choice: ");
               
                int choice = sc.nextInt();
                if (choice == 1) {
                    System.out.println("Enter the amount to deposit: ");
                    double amount = sc.nextDouble();
                    balance += amount;
                    System.out.println("Amount deposited successfully. New balance: " + balance);
               
                } else if (choice == 2) {
                    System.out.println("Enter the amount to withdraw: ");
                    double amount = sc.nextDouble();
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Amount withdrawn successfully. New balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
              
                } else if (choice == 3) {
                    System.out.println("Account Status:\nUsername: " + username + "\nCurrent Balance: " + balance);
              
                } else {
                    System.out.println("Invalid choice.");
                }
              
                System.out.println("Do you want to continue? [y/n]: ");
                char cont = sc.next().charAt(0);
                if (cont == 'n') break;
            }
        } else {
            System.out.println("Invalid credentials");
        }
    }

}

