import java.util.Scanner;

public class ex1 {
    public static void main(String args[]){

        // 1.Write a program to display sum of the first 100 integer numbers using for loop.
        int sum = 0;
        for(int i = 1;i<=100;i++){
            sum+=i; 
        }
        System.out.println(sum);
        try (// 2.Write statements that can be used in a Java program to read two integers and 
                // display the number of integers that lie between them, including the integers themselves. 
                // For example, four integers are between 3 and 6: 3, 4, 5, and 6.
        Scanner input = new Scanner(System.in)) {
            int number1,number2;
            System.out.println("Enter first number: ");
            number1 = input.nextInt();
            System.out.println("Enter second number: ");
            number2 = input.nextInt();
            int start_from=number1;
            int end_with=number2, total_num=0;
            if (number1 < number2) {
                 start_from=number1;
                 end_with=number2;
                 total_num = (number2-number1)+1;
            }
            else if (number1>number2) {
                 start_from=number2;
                 end_with=number1;
                 total_num = (number1-number2)+1;
                
            } 
            System.out.println(total_num +" number between "+number1+" and "+number2+": ");
            for(int i = start_from;i<=end_with;i++){
                if (i!=end_with) {
                    System.out.print(i+", ");
                }
                else 
                  System.out.print(i+"\n");

                
            }
            // 3.Write a program that reads an integer value and prints the sum of all even integers 
            // between 2 and the input value, inclusive. Print an error message if the input value is less than 2.
            System.out.println("Enter the number: "); 
            int num = input.nextInt();
            sum = 0;
            if (num>=2) {
                for(int i=2;i<=num;i+=2){
                    sum+=i;
                }
                System.out.println("Sum of total even number from 2 up to "+num+" is "+sum);
                
            }
            else {
                System.out.println("invalid input");
            }
            // 4.Write a java program that accepts integer value from  a user and 
            // display sum of each digit(E.g. input: 543, result: 5+4+3=12)

                @SuppressWarnings("resource")
                Scanner scanner = new Scanner(System.in);

                // Step 1: Get input from the user
                System.out.print("Enter an integer: ");
                int number = scanner.nextInt(); // User inputs 
                sum = 0; // Initialize sum to 0
                int originalNumber = number; // Store the original number for display

                // Step 2: Loop to extract and add each digit
                while (number != 0) {
                    int digit = number % 10; // Extract the last digit
                    sum += digit;            // Add the digit to the sum
                    number /= 10;            // Remove the last digit
                }

                // Step 3: Display the result
                System.out.println("The sum of the digits of " + originalNumber + " is: " + sum);


        }


    }
    
}
