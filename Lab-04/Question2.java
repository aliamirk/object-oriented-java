package Lab4;

public class Question2 {
    String Name;
    int ID;
    double GPA;

    public Question2(String N, int NO, double B) {
        this.Name = N;
        this.ID = NO;
        this.GPA = B;

        System.out.println("New Bacha ka Profile Created");
        System.out.println("ID: " + this.ID);
        System.out.println("Name: " + this.Name);
        System.out.println("GPA: " + this.GPA);
        System.out.println(" ");

    }

    public Question2() {
        this.Name = "Default Bacha";
        this.ID = 000;
        this.GPA = 0.0;

        System.out.println("Default Bacha ka Profile Created");
        System.out.println("ID: " + this.ID);
        System.out.println("Name: " + this.Name);
        System.out.println("GPA: " + this.GPA);
        System.out.println(" ");

    }

    @Override
    protected void finalize() {
        System.out.println("Student Record Deleted: " + this.ID + ", " + this.Name);
    }

}

class testq2 {
    public static void main(String[] args) {
        Question3 b1 = new Question3("Minhal Raza", 101, 4.5);
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