// File: package2/TestPublic.java
package package2;

// Import the PublicExample class from package1
import package1.PublicExample;

public class TestPublic {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        obj.displayMessage(); // Accessing public method from package1
    }
}
