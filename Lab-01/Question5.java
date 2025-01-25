import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter your Number: ");
        num = sc.nextInt();
        int sum = 1;

        while (num > 0){

            sum = sum * num;
            num = num - 1;
        }
        System.out.print("The Factorial is : " + sum);
    }

}
