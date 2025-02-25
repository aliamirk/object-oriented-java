package Lab4;

public class Question1 {
    String accountName;
    int accountNo;
    double accountBalance;

    public Question1(String accountName, int accountNo, double accountBalance) {
        this.accountName = accountName;
        this.accountNo = accountNo;
        this.accountBalance = accountBalance;

        System.out.println("Parameterized Account Created");
        System.out.println("Account Number: " + this.accountNo);
        System.out.println("Customer Name" + this.accountName);
        System.out.println("Balance: " + this.accountBalance);
        System.out.println(" ");

    }

    public Question1() {
        this.accountName = "Default";
        this.accountNo = 0000;
        this.accountBalance = 0.0;

        System.out.println("Default Account Created");
        System.out.println("Account Number: " + this.accountNo);
        System.out.println("Customer Name" + this.accountName);
        System.out.println("Balance: " + this.accountBalance);
        System.out.println(" ");

    }

    @Override
    protected void finalize() {
        System.out.println("Account: " + this.accountNo + " Deleted");
    }

}

 class testq1 {
     public static void main(String[] args) {
         Question1 a1 = new Question1("Ali", 12345, 50000.0);
         Question1 a2 = new Question1();
         a1 = null;
         a2 = null;
         System.gc();
         try {
             Thread.sleep(1000); // GC was not getting called and program stopped execution so i added this.
         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
     }
}