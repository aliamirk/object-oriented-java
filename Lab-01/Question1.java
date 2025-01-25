import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;


        System.out.print("Enter your Number 1: ");
        num1 = sc.nextInt();

        System.out.print("Enter your Number 2: ");
        num2 = sc.nextInt();

        System.out.print("Enter your Number 3: ");
        num3 = sc.nextInt();


        System.out.println("The sum is :" + (num1 + num2 + num3));
        System.out.println("Your Average is : " + (num1 + num2 + num3 / 3));
        System.out.println("The Product is :" + (num1 * num2 * num3));


    }
}
