package Lab4;

public class Question3 {
    String Product;
    int Quantity;
    double Price;

    public Question3(String N, int NO, double B) {
        this.Product = N;
        this.Quantity = NO;
        this.Price = B;

        System.out.println("New Maal Added");
        System.out.println("Product: " + this.Product);
        System.out.println("Price: " + this.Price);
        System.out.println("Quantity: " + this.Quantity);
        System.out.println(" ");

    }

    public Question3() {
        this.Product = "Generic";
        this.Quantity = 1;
        this.Price = 0.0;

        System.out.println("Default Maal Added");
        System.out.println("Product: " + this.Product);
        System.out.println("Price: " + this.Price);
        System.out.println("Quantity: " + this.Quantity);
        System.out.println(" ");

    }

    @Override
    protected void finalize() {
        System.out.println("Maal Removed from Cart: " + this.Product);
    }

}

class testq3 {
    public static void main(String[] args) {
        Question3 b1 = new Question3("Laptop", 2, 12200.2);
        Question3 b2 = new Question3();
        b1 = null;
        b2 = null;
        System.gc();
        try {
            Thread.sleep(1000); // GC was not getting called and program stopped execution so i added this.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}