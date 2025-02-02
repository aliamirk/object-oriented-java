import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] items = new String[5];
        double[] prices = new double[5];
        double total = 0, discount = 0;

        System.out.println("Enter items (name and price):");
        for (int i = 0; i < 5; i++) {
            items[i] = sc.next();
            prices[i] = sc.nextDouble();
            total += prices[i];
        }

        if (total > 500) {
            discount = total * 0.10;
        }else {
            discount = total * 0.05;
        }
        
        System.out.println("SHOPPING RECEIPT");
        System.out.println("Subtotal: $" + total);
        System.out.println("Discount percent: " + (discount / total * 100));
        System.out.println("Discount amount: $" + discount);
        System.out.println("Total after discount: $" + (total - discount));
    }
}
