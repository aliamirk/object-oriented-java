class Person {
    String name;
    String email;
    String phone;

    public Person(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String toString() {
        return "Name: " + name + ", Email: " + email + ", Phone: " + phone;
    }
}

// Subclass: Student
class Student extends Person {
    String studentId;
    String major;
    double gpa;

    public Student(String name, String email, String phone, String studentId, String major, double gpa) {
        super(name, email, phone);
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
    }

    public double getGPA() {
        return gpa;
    }

    public String toString() {
        return super.toString() + ", Student ID: " + studentId + ", Major: " + major + ", GPA: " + gpa;
    }
}

// Subclass: Faculty
class Faculty extends Person {
    String facultyId;
    String department;
    String rank;

    public Faculty(String name, String email, String phone, String facultyId, String department, String rank) {
        super(name, email, phone);
        this.facultyId = facultyId;
        this.department = department;
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public String toString() {
        return super.toString() + ", Faculty ID: " + facultyId + ", Department: " + department + ", Rank: " + rank;
    }
}

// Subclass: Staff
class Staff extends Person {
    String staffId;
    String jobTitle;
    double salary;

    public Staff(String name, String email, String phone, String staffId, String jobTitle, double salary) {
        super(name, email, phone);
        this.staffId = staffId;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return super.toString() + ", Staff ID: " + staffId + ", Job Title: " + jobTitle + ", Salary: $" + salary;
    }
}

// Main class to test everything
public class Question2 {
    public static void main(String[] args) {
        System.out.println("Ali - 24K-3103\n");

        Student student = new Student("Ali Amir", "alie@gmail.com", "123-456-7890", "3103", "Software Engineering", 3.85);
        Faculty faculty = new Faculty("Dr. Minhal Raza", "minhal.raza@nu.edu.pk", "555-123-4567", "456", "Software Engineering", "Professor");
        Staff staff = new Staff("Nadeeem", "nadeem@nu.edu.pk", "987-654-3210", "789", "Lab Instructor", 48000.00);

        System.out.println("Student Info: " + student);
        System.out.println("GPA: " + student.getGPA());

        System.out.println("\nFaculty Info: " + faculty);
        System.out.println("Rank: " + faculty.getRank());

        System.out.println("\nStaff Info: " + staff);
        System.out.println("Salary: $" + staff.getSalary());
    }
}
