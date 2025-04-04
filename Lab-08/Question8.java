
class Accounts {
    protected double balance;

    public Accounts(double balance) {
        this.balance = balance;
    }

    public void debit(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds! Cannot withdraw " + amount);
        } else {
            balance -= amount;
            System.out.println("Debited: $" + amount);
        }
    }

    public void credit(double amount) {
        balance += amount;
        System.out.println("Credited: $" + amount);
    }

    public void getBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingAccount extends Accounts {
    private double timeSpan;
    private static final double INTEREST_RATE = 0.05;

    public SavingAccount(double balance, double timeSpan) {
        super(balance);
        this.timeSpan = timeSpan;
    }

    public double calculateInterest() {
        return balance * INTEREST_RATE * timeSpan;
    }

    @Override
    public void credit(double amount) {
        double interest = calculateInterest();
        balance += interest;
        System.out.println("Interest of $" + interest + " added.");
        super.credit(amount);
    }
}

class CheckingAccount extends Accounts {
    public CheckingAccount(double balance) {
        super(balance);
    }
}

public class Question8 {
    public static void main(String[] args) {
        System.out.println("Ali - 24K-3103\n");

        SavingAccount savings = new SavingAccount(1000, 2);
        System.out.println("\n--- Savings Account Transactions ---");
        savings.getBalance();
        savings.credit(500);
        savings.debit(300);
        savings.getBalance();

        CheckingAccount checking = new CheckingAccount(2000);
        System.out.println("\n--- Checking Account Transactions ---");
        checking.getBalance();
        checking.credit(800);
        checking.debit(500);
        checking.getBalance();
    }
}
