// Abstract class A
abstract class A {
    // Abstract method (must be implemented by subclasses)
    abstract void callme();

    // Concrete method (can be directly used by subclasses)
    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}

// Class B extends abstract class A and implements the abstract method
class B extends A {
    // Implementation of the abstract method
    @Override
    void callme() {
        System.out.println("B's implementation of callme.");
    }
}

// Main class to demonstrate functionality
public class AbstractDemo {
    public static void main(String[] args) {
        // Create an instance of class B
        B b = new B();

        // Call the implemented abstract method
        b.callme();

        // Call the concrete method from the abstract class
        b.callmetoo();
    }
}
