package inheritance.overload_and_override;

public class MethodOverload {
    // Test overloaded square methods
    public void testOverloadedMethods() {
        System.out.println("Square of integer 7 is " + square(7));
        System.out.println("Square of double 7.5 is " + square(7.5));
    }

    public int square(int intValue) {
        System.out.println("Called square with int argument: " + intValue);
        return intValue * intValue;
    }

    public double square(double doubleValue) {
        System.out.println("Called square with double argument: " + doubleValue);
        return doubleValue * doubleValue;
    }

    public static void main(String[] args) {
        MethodOverload methodOverload = new MethodOverload();
        methodOverload.testOverloadedMethods();
    }
}

