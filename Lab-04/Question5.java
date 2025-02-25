package Lab4;

public class Question5 {
    int id, power;
    String type, status;

    Question5(int id, String type, int power, String status){
        this.id = id;
        this.power = power;
        this.type = type;
        this.status = status;
        System.out.println("Device ID: " + this.id + " | " + "Type: " + this.type + " | " + "Power: " + this.power + " | " + "Status: " + this.status);
    }

    Question5(){
        this.id = 0000;
        this.power = 0;
        this.type = "Unknown";
        this.status = "OFF";

        System.out.println("\nDevice ID: " + this.id);
        System.out.println("Type: " + this.type);
        System.out.println("Power Consumption: " + this.power + "W");
        System.out.println("Status: " + this.status);
    }

    public int getPower(){
        return power;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Device record deleted: " + this.id);
    }
}

class testq5{
    public static void main(String[] args) {
        System.out.println("Default Device Added:");
        Question5 a1 = new Question5();

        System.out.println("\nNew Devices Added:");
        Question5 a2 = new Question5(1001, "Smart Light", 10, "ON");
        Question5 a3 = new Question5(1002, "Air Conditioner", 1500, "ON");
        Question5 a4 = new Question5(1003, "Smart Fan", 50, "OFF");

        int totalPower = (a1.getPower() + a2.getPower() + a3.getPower() + a4.getPower());
        System.out.println("\nTotal Active Power Consumption: " + totalPower);

        // Garbage Collection
        a1 = null;
        a2 = null;
        a3 = null;
        a4 = null;

        System.gc();
        try {
            Thread.sleep(1000); // GC was not getting called and program stopped execution so i added this.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
