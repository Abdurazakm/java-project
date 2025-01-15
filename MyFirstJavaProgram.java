import java.util.Random;
import java.util.Scanner; // program uses class Scanner 

public class MyFirstJavaProgram {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String[] args) {
        // This is an example of single line comment
        /*
         * This is also an example of
         * multline comment.
         */
        System.out.println("Hello World");
        int a = 10, b = 20, c; // Declares and initialization of three ints variable a,b,and c.
        byte B = 22; // initalize a byte type variable
        double pi = 3.14159;// declares and assigns a value of PI.
        char charct = 'a';// the char variable charct is initiazed with value 'a'
        char tm = '\u2122';// \u2122 is the trademark symobol
        System.out.println(tm);
        // EscapeExample
        System.out.println("two\nlines");
        System.out.println("\"This is in quates\"");
        String text, text1, text2, text3;
        text = "Espresso";
        System.out.print(text.substring(2, 7)); // char at end position is not included
        text1 = ""; // empty string
        text2 = "Hello";
        text3 = "Java";
        System.out.println("\n");
        System.out.println(text1.length()); // output: 0
        System.out.println(text2.length()); // output: 5
        System.out.println(text3.length()); // output: 4

        /*
         * Indexof
         * Locate the index position of a substring within another string
         * Example
         */
        text = "I Love Java and Java loves me.";
        System.out.println("Index of");
        System.out.println(text.indexOf("J"));
        System.out.println(text.indexOf("love"));
        System.out.println(text.indexOf("ove"));
        // String concatenation
        // Use the plus symbol (+) for string concatenation
        System.out.println("concatination");

        System.out.println(text2 + text3);// --------- "Hell0Java"
        System.out.println(text2 + " " + text3);// --------- "Hello Java"
        System.out.println("How are you," + text3);// -------------- "How are you, Java?"

        String textthree = "I Love Java and Java loves me.", textone = "Hello", texttwo = "World";
        System.out.println(textone.substring(1, 3));
        System.out.println(texttwo.length());
        System.out.println(textthree.indexOf("I"));
        System.out.println(textone + " " + textthree);

        // This would produce the following result:
        System.out.println("a == b = " + (a == b));// a == b =false
        System.out.println("a != b = " + (a != b));// a != b =true

        // conditional statement
        int x = 10;
        if (x < 20) {
            System.out.println("This is if statement");
        }

        // if else statement
        int y = 30;
        if (y < 20) {
            System.out.println("This is if statement");
        } else {
            System.out.println("This is else statement");
        }

        // this is if, else if, and else statement
        if (y == 10) {
            System.out.println("Value of X is 10");
        } else if (y == 20) {
            System.out.println("Value of X is 20");
        } else if (y == 30) {
            System.out.println("Value of X is 30");
        } else {
            System.out.println("This is else statement");
        }

        // switch statement
        char grade = 'C';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Well done");
                break;
            case 'C':
                System.out.println("You passed");
                break;
            case 'D':
                System.out.println("You Failed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " + grade);

       Scanner input = new Scanner( System.in );
	   int number1; // first number to add
	   int number2; // second number to add
	   int sum; // sum of number1 and number2
 	   System.out.print( "Enter first integer: " ); // prompt
	   number1 = input.nextInt(); // read first number from user
	   System.out.print( "Enter second integer: " ); // prompt
	   number2 = input.nextInt(); // read second number from user
	   sum = number1 + number2; // add numbers
       System.out.println( "Sum is " + sum ); 


        Scanner console = new Scanner(System.in);
        System.out.print("How old are you? "); // prompt
        int age = console.nextInt();
        System.out.println("You'll be 30 in " + (30 - age) + " years.");



        Scanner abdure = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = abdure.nextLine();
        System.out.println("Hello there " + name + ", nice to meet you!");

        for (int i = 0; i < 3; i++) {
            for (int j = 2; j < 4; j++) {
                 System.out.println (i + " " + j); 
            }
        }
         




       //Math-Class
        //The java.lang.Math class contains methods for performing basic numeric operations such as exponential, logarithm, square root, and trigonometric functions
        float p = (float) 3.2;
        float q = (float) 3.9;
        int o =2;
        int v = 5;
        System.out.println("ceil round to upper "+Math.ceil(p)); //Math.ceil(3.2) and Math.ceil(3.9) both return 4.0
        System.out.println("floor round to lower "+Math.floor(q)); // Math.floor(3.2) and Math.floor(3.9) both return 3.0
        System.out.println("power nth "+Math.pow(o,v)); //Math.pow(4,2) returns 16.0
        System.out.println("round to closest "+Math.round(x)); //Math.round(3.2) returns 3; Math.round(3.6) returns 4
        System.out.println("maximum "+Math.max(o,v)); // Math.max(1, 2) returns 2
        System.out.println("square of a number "+Math.sqrt(x)); // Math.sqrt(4) returns 2.0
        System.out.println("generate the round number "+Math.random());// a random floating point number between 0 and 1. generates a double value in the range [0,1)
        //Eg: Math.random()*100
        System.out.println("change to degree "+Math.toDegrees(x));
        System.out.println("triginometeric function "+Math.sin(x));


        //Random is a class used to generate random numbers between the given lists/ranges.
        // Example: 

		double z []=new double[20];
		Random r=new Random();
		Scanner s=new Scanner(System.in);		
		    for(int i=0;i<5;i++){
		       z[i]=r.nextInt(100);
		       System.out.println(z[i]);
            }









    }

}
