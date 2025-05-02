package lab11;

import java.util.ArrayList;

class Warehouse<T> {
    T item;

    public Warehouse(T item) {
        this.item = item;
    }

    public void display() {
        System.out.println("Item: " + item);
    }

    public T getItem() {
        return item;
    }
}

public class Question3 {
    public static void main(String[] args) {
        System.out.println("\nMuhammad Ali - 24K-3103\n");

        Warehouse<String> product1 = new Warehouse<>("Laptop");
        Warehouse<String> product2 = new Warehouse<>("Mobile");
        Warehouse<String> product3 = new Warehouse<>("Tablet");

        ArrayList<Warehouse<String>> electronics = new ArrayList<>();
        electronics.add(product1);
        electronics.add(product2);
        electronics.add(product3);

        Warehouse<Integer> quantity1 = new Warehouse<>(10);
        Warehouse<Integer> quantity2 = new Warehouse<>(25);
        Warehouse<Integer> quantity3 = new Warehouse<>(15);

        ArrayList<Warehouse<Integer>> quantities = new ArrayList<>();
        quantities.add(quantity1);
        quantities.add(quantity2);
        quantities.add(quantity3);

        System.out.println("Inventory List:");
        for (int i = 0; i < electronics.size(); i++) {
            String product = electronics.get(i).getItem();
            int quantity = quantities.get(i).getItem();
            System.out.println(product + " - Quantity: " + quantity);
        }
    }
}
