import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] books = new String[5];
        
        System.out.println("Enter the titles of 5 books being borrowed:");
        for (int i = 0; i < 5; i++) {
            books[i] = sc.nextLine();
        }
        System.out.println("LIBRARY RECEIPT");
        System.out.println("Borrowed Books:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println("Fine Per Day (Overdue): $2.00");
    }
}
