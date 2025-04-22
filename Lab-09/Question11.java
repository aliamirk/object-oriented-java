

abstract class ElectricityConsumer {
    String consumerId;
    int unitsConsumed;
    int peakHourUsage;

    public ElectricityConsumer(String consumerId, int unitsConsumed, int peakHourUsage) {
        this.consumerId = consumerId;
        this.unitsConsumed = unitsConsumed;
        this.peakHourUsage = peakHourUsage;
    }

    abstract double calculateBill();
    abstract double applyPeakHourPenalty();

    public void generateBill() {
        double baseBill = calculateBill();
        double penalty = applyPeakHourPenalty();
        double finalBill = baseBill + penalty;

        System.out.println("\nBill for Consumer ID: " + consumerId);
        System.out.println("Base Bill: $" + baseBill);
        System.out.println("Peak Hour Penalty: $" + penalty);
        System.out.println("Total Bill: $" + finalBill);
    }
}

class ResidentialConsumer extends ElectricityConsumer {
    public ResidentialConsumer(String consumerId, int unitsConsumed, int peakHourUsage) {
        super(consumerId, unitsConsumed, peakHourUsage);
    }

    @Override
    double calculateBill() {
        double rate = 5.0; // per unit
        double bill = unitsConsumed * rate;
        return Math.max(bill, 100);
    }

    @Override
    double applyPeakHourPenalty() {
        return peakHourUsage * 1.5;
    }
}

class CommercialConsumer extends ElectricityConsumer {
    public CommercialConsumer(String consumerId, int unitsConsumed, int peakHourUsage) {
        super(consumerId, unitsConsumed, peakHourUsage);
    }

    @Override
    double calculateBill() {
        double rate = 8.0;
        double bill = unitsConsumed * rate;
        return Math.max(bill, 500);
    }

    @Override
    double applyPeakHourPenalty() {
        return peakHourUsage * 2.5;
    }
}

class IndustrialConsumer extends ElectricityConsumer {
    public IndustrialConsumer(String consumerId, int unitsConsumed, int peakHourUsage) {
        super(consumerId, unitsConsumed, peakHourUsage);
    }

    @Override
    double calculateBill() {
        double rate = 10.0;
        double bill = unitsConsumed * rate;
        return Math.max(bill, 1000);
    }

    @Override
    double applyPeakHourPenalty() {
        return peakHourUsage * 5.0;
    }
}

class BillAudit {
    public static void averageBill(ElectricityConsumer[] consumers) {
        double total = 0;
        for (ElectricityConsumer c : consumers) {
            total += c.calculateBill() + c.applyPeakHourPenalty();
        }
        double avg = total / consumers.length;
        System.out.println("\nAverage Bill (Audit Report): $" + avg);
    }
}

// Main Class
public class Question11 {
    public static void main(String[] args) {
        System.out.println("Muhammad Ali - 24K-3103");

        ElectricityConsumer r1 = new ResidentialConsumer("RES1001", 30, 5);
        ElectricityConsumer c1 = new CommercialConsumer("COM2001", 80, 8);
        ElectricityConsumer i1 = new IndustrialConsumer("IND3001", 120, 12);

        r1.generateBill();
        c1.generateBill();
        i1.generateBill();

        ElectricityConsumer[] allConsumers = {r1, c1, i1};
        BillAudit.averageBill(allConsumers);
    }
}
