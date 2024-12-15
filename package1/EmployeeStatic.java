package package1;

// EmployeeStatic.java
public class EmployeeStatic {
    private String firstName; // Instance variable
    private String lastName;  // Instance variable
    private static int count = 0; // Static variable to track object count

    // Constructor
    public EmployeeStatic(String first, String last) {
        firstName = first;    // Initialize first name
        lastName = last;      // Initialize last name
        count++;              // Increment static count
        System.out.println("Employee constructor: " + firstName + " " + lastName + "; count = " + count);
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Static getter for count
    public static int getCount() {
        return count;
    }
}

