package package1;
public class EmployeeStaticTest {
    public static void main(String[] args) {
        // Show that count is 0 before creating Employees
        System.out.println("Employees before instantiation: " + EmployeeStatic.getCount());

        // Create two EmployeeStatic objects
        EmployeeStatic e1 = new EmployeeStatic("Susan", "Baker");
        EmployeeStatic e2 = new EmployeeStatic("Bob", "Blue");

        // Show that count is 2 after creating two Employees
        System.out.println("\nEmployees after instantiation:");
        System.out.println("via e1.getCount(): " + e1.getCount()); // Access through object (not recommended)
        System.out.println("via e2.getCount(): " + e2.getCount()); // Access through object (not recommended)
        System.out.println("via EmployeeStatic.getCount(): " + EmployeeStatic.getCount()); // Recommended way

        // Print employee names
        System.out.println("\nEmployee 1: " + e1.getFirstName() + " " + e1.getLastName());
        System.out.println("Employee 2: " + e2.getFirstName() + " " + e2.getLastName());
    }
}
