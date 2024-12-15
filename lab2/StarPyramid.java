
import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of rows for the pyramid
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            // Print spaces to align stars in a pyramid shape
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars for the current row
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}

    

