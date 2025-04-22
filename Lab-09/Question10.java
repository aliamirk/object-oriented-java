
interface OrderPolicy {
    void acceptOrder(String orderId);
    int calculatePreparationTime(String item);

    static void commonGuidelines() {
        System.out.println("General Order Guidelines:");
        System.out.println("- Orders must be accepted within 2 minutes.");
        System.out.println("- Preparation time should be accurate to avoid delays.");
    }
}

interface DeliveryPolicy {
    void assignRider(String location);
    double calculateDeliveryCharge(double distance);
}

class RestaurantPartner implements OrderPolicy, DeliveryPolicy {
    @Override
    public void acceptOrder(String orderId) {
        System.out.println("Order " + orderId + " accepted by RestaurantPartner.");
    }

    @Override
    public int calculatePreparationTime(String item) {
        int prepTime = item.length() * 2; // will calculate random times
        System.out.println("Estimated preparation time for " + item + ": " + prepTime + " mins.");
        return prepTime;
    }

    @Override
    public void assignRider(String location) {
        System.out.println("Assigning nearby rider to deliver at " + location);
    }

    @Override
    public double calculateDeliveryCharge(double distance) {
        double charge = 10 + distance * 2; // Basic delivery charge logic
        System.out.println("Standard delivery charge: $" + charge);
        return charge;
    }
}

class ExpressDeliveryPartner implements DeliveryPolicy {
    @Override
    public void assignRider(String location) {
        System.out.println("Express rider dispatched immediately to " + location);
    }

    @Override
    public double calculateDeliveryCharge(double distance) {
        double charge = 15 + distance * 3; // Premium delivery rate
        System.out.println("Express delivery charge: $" + charge);
        return charge;
    }
}

public class Question10 {
    public static void main(String[] args) {

        System.out.println("Muhammad Ali - 24K-3103");
        OrderPolicy orderPartner = new RestaurantPartner();
        DeliveryPolicy deliveryPartner = new RestaurantPartner();

        OrderPolicy.commonGuidelines();

        System.out.println("\n--- Restaurant Partner Operations ---");
        orderPartner.acceptOrder("ORD123");
        orderPartner.calculatePreparationTime("Burger");

        deliveryPartner.assignRider("Main Street");
        deliveryPartner.calculateDeliveryCharge(5.0);

        System.out.println("\n--- Delivery Partners Polymorphism ---");
        DeliveryPolicy[] partners = {
                new RestaurantPartner(),
                new ExpressDeliveryPartner()
        };

        for (DeliveryPolicy partner : partners) {
            partner.assignRider("Downtown");
            partner.calculateDeliveryCharge(4.0);
            System.out.println();
        }
    }
}

