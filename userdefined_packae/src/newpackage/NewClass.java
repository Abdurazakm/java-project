package newpackage;
import calculator.Calculator;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
        Scanner calcul = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double n1 = calcul.nextDouble();
        System.out.println("Enter second number: ");
        double n2 = calcul.nextDouble();
        Calculator add = new Calculator(n1,n2);
        Calculator subs = new Calculator(n1,n2);
        Calculator mult = new Calculator(n1,n2);
        Calculator div = new Calculator(n1,n2);
        System.out.println("sum of "+n1+" and "+n2+" is equal to "+add.add());
        System.out.println("difference of "+n1+" and "+n2+" is equal to "+subs.subtraction());
        System.out.println("time of "+n1+" and "+n2+" is equal to "+mult.multiplication());
        System.out.println("division of "+n1+" and "+n2+" is equal to "+div.division());




    }
}
