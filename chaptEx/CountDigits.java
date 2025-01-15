package chaptEx;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int oddCount = 0, evenCount = 0, zeroCount = 0;

        while (number != 0) {
            int digit = Math.abs(number % 10); // Extract the last digit
            if (digit == 0) {
                zeroCount++;
            } else if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            number /= 10; // Remove the last digit
        }

        System.out.println("Number of odd digits: " + oddCount);
        System.out.println("Number of even digits: " + evenCount);
        System.out.println("Number of zero digits: " + zeroCount);
    }
}


