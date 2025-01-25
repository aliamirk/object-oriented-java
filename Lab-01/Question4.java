import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter your Number: ");
        num = sc.nextInt();
        int sum = 0;

        while (num != 0){
            sum =  sum + (num % 10);
            num = num / 10;
        }
        System.out.print("The Sum is : " + sum);
    }


}
