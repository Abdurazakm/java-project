package chaptEx;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.print("Reversed number: ");
        while (number > 0) {
            System.out.print(number % 10); // Extract the last digit
            number /= 10; // Remove the last digit
        }
    }
}
