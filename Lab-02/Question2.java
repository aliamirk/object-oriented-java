package lab2.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Question2 {
    ArrayList<String> todoList = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);

    void addItem() {
        String item;
        System.out.print("Enter the name of item to add: ");
        item = sc.nextLine();
        todoList.add(item);
        System.out.println("Item added to list successfully");
    }

    void removeItem() {
        String item;
        System.out.print("Enter the name of item to remove: ");
        item = sc.nextLine();
        todoList.remove(item);
        System.out.println("Item removed from list successfully");
    }

    void displayItems() {
        for (String item : todoList) {
            System.out.println("Displaying Items");
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question2 test = new Question2();
        int choice;

        do {
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Display items");

            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1){
                test.addItem();
                System.out.println("Showing Updated List");
                test.displayItems();

            } else if (choice == 2) {
                test.removeItem();
                System.out.println("Showing Updated List");
                test.displayItems();

            } else{
                test.displayItems();
            }

        } while (choice != 0);


    }
}

