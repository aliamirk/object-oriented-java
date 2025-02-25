package Lab4;

public class Question4 {
    int id;
    String name;
    double basicSalary, tax, bonus, netSalary;

//  Parameterized Constructor
    Question4(int id, String name, double basicSalary, double tax, double bonus) {
        System.out.println("New Employee Id");
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.netSalary = 0.0;
        this.tax = tax;
    }

//  Default Constructor
    Question4() {
        System.out.println("Default Employee Created");
        this.id = 000;
        this.name =  "Default";
        this.basicSalary = 0.0;
        this.tax = 0;
        this. bonus = 0.0;
        this.netSalary = 0.0;
    }

    public void display() {
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Tax Deduction: " + this.tax + "%");
        System.out.println("Bonus: " + this.bonus);
        if (this.netSalary == 0.0){
            System.out.println("Net Salary: " + this.netSalary);
        }  else {
            this.netSalary = (this.basicSalary - (this.basicSalary * 0.1)) + this.bonus;
            System.out.println("Net Salary: " + this.netSalary + " - (" + this.tax + "% of " + this.basicSalary + " + "+ this.bonus + " = " + this.netSalary);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("\nEmployee record deleted. " + this.name + "\nMemory for bonus released.");
    }
}

class testq4 {
    public static void main(String[] args) {
        Question4 e1 =  new Question4();
        Question4 e2 = new Question4(101, "Nadeem Ghouri", 150000.0, 10.0, 5000.0);

        e1.display();
        System.out.println(" ");
        e2.display();

        e1 = null;
        e2 = null;
        System.gc();
        try {
            Thread.sleep(1000); // GC was not getting called and program stopped execution so i added this.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}