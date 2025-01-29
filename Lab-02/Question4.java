package lab2.com;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        int evenSum = 0, oddSum = 0, num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Integers b/w 1 and 100 (-1 to stop): ");
            num = sc.nextInt();

            if (num % 2 == 0){
                evenSum += num;
            } else {
                oddSum += num;
            }
        } while (num != -1);

        System.out.println("Sum of Even Numbers: " + evenSum);
        System.out.println("Sum of Odd Numbers: " + oddSum + 1);

    }

}
