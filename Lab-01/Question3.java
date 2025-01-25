import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;


        System.out.print("Enter your Number 1: ");
        num1 = sc.nextInt();

        System.out.print("Enter your Number 2: ");
        num2 = sc.nextInt();

        System.out.print("Enter your Number 3: ");
        num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.print("Number 1 is the largest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.print("Number 2 is the largest");
        } else {
            System.out.print("Number 3 is the largest");
        }
    }

}
