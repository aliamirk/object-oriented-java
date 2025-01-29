package lab2.com;

import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {


    public static void main(String[] args) {
        double discount, salexTax, subTotal = 0, TotalbeforeTax, invoiceTotal;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Float> prices = new ArrayList<Float>();

        for (int i=0; i<5; i++){
            System.out.print("Enter the Name of item " + (i+1) + ": ");
            String name = sc.nextLine();
            System.out.print("Enter the Price: ");
            float price = sc.nextFloat();
            sc.nextLine();
            names.add(name);
            prices.add(price);
        }

        // Subtotal
        for (float price: prices){
            subTotal = subTotal + price;
        }
        discount = subTotal * 0.1;
        salexTax = subTotal * 0.05;
        TotalbeforeTax = subTotal - discount;
        invoiceTotal = TotalbeforeTax + salexTax;


        // Displaying Invoice
        System.out.println("*************************");
        System.out.println("         Invoice         ");
        System.out.println("*************************");
        System.out.println(" Itemized List            ");

        for (int i=0; i<5; i++){
            System.out.println(i + "." + names.get(i) + "          " + prices.get(i));
        }

        System.out.println("*************************");
        System.out.println(" Subtotal: " + subTotal);
        System.out.println(" Discount Percent:    10%");
        System.out.println(" Discount Amount:      " + discount);
        System.out.println("*************************");
        System.out.println(" Total Before Tax:      " + TotalbeforeTax);
        System.out.println(" Sales Tax (5%):      " + salexTax);
        System.out.println("*************************");
        System.out.println(" Invoice Total:      " + invoiceTotal);
        System.out.println("*************************");
        System.out.println("Thank you for shopping with us");
        System.out.println("*************************");

    }

}
