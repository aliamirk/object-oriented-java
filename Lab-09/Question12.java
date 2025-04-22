
interface TradingEngine {
    void placeOrder();
    void runRiskChecks();

    static void tradingPolicy() {
        System.out.println("Trading Policy: All trades must pass risk checks before execution.");
    }
}

interface ComplianceEngine {
    void generateReport();
    void logAuditTrail();

    static void compliancePolicy() {
        System.out.println("Compliance Policy: All trades must be audited and reported to PSX.");
    }
}

class AlgoTrader implements TradingEngine, ComplianceEngine {

    @Override
    public void placeOrder() {
        System.out.println("AlgoTrader placing automated order...");
    }

    @Override
    public void runRiskChecks() {
        System.out.println("AlgoTrader running automated risk checks...");
    }

    @Override
    public void generateReport() {
        System.out.println("AlgoTrader generating compliance report...");
    }

    @Override
    public void logAuditTrail() {
        System.out.println("AlgoTrader logging audit trail...");
    }
}

class HumanTrader implements TradingEngine {

    @Override
    public void placeOrder() {
        System.out.println("HumanTrader manually placing order...");
    }

    @Override
    public void runRiskChecks() {
        System.out.println("HumanTrader approving risk manually...");
    }
}

// Main class
public class Question12 {
    public static void main(String[] args) {
        System.out.println("Muhammad Ali - 24K-3103");

        AlgoTrader algo = new AlgoTrader();
        algo.placeOrder();
        algo.runRiskChecks();
        algo.generateReport();
        algo.logAuditTrail();

        System.out.println("\nPolymorphism with TradingEngine and ComplianceEngine arrays:");

        TradingEngine[] tradingEngines = {
                new AlgoTrader(),
                new HumanTrader()
        };

        ComplianceEngine[] complianceEngines = {
                new AlgoTrader()
        };

        for (TradingEngine t : tradingEngines) {
            t.placeOrder();
            t.runRiskChecks();
        }

        for (ComplianceEngine c : complianceEngines) {
            c.generateReport();
            c.logAuditTrail();
        }

        System.out.println("\nStatic Policy Guidelines:");
        TradingEngine.tradingPolicy();
        ComplianceEngine.compliancePolicy();
    }
}
