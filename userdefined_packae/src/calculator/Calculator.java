package calculator;

public class Calculator {
    public double num1, num2;
    public Calculator(double n1, double n2){
        num1=n1;
        num2=n2;
    }
    public double add(){
        return num1 + num2;
    }
    public double subtraction(){
        return num1 - num2;
    }
    public double multiplication(){
        return num1 * num2;
    }
    public double division(){
        if(num2!=0) {
            return num1 / num2;
        }
        else
            System.out.println("the no number is undefined bc num2 is equal to 0");
        return 0;
    }
}
