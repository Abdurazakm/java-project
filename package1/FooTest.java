package package1;

public class Foo {
    int i; // Instance variable
    static String s; // Static variable

    void imethod() {
        System.out.println("This is an instance method.");
    }

    static void smethod() {
        System.out.println("This is a static method.");
    }
}

public class FooTest {
    public static void main(String[] args) {
        Foo f = new Foo();
        
        // Correct usage
        System.out.println(f.i); // Access instance variable
        System.out.println(f.s); // Access static variable
        f.imethod(); // Call instance method
        f.smethod(); // Call static method

        // Directly using the class name for static members
        System.out.println(Foo.s);
        Foo.smethod();

        // Incorrect usage
        // System.out.println(Foo.i); // Error: Cannot access instance variable directly
        // Foo.imethod(); // Error: Cannot call instance method directly
    }
}
