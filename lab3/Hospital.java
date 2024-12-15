// Base class for all employees
class Employee {
    String name;
    int id;
    String department;

    // Constructor
    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    // Common method
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", Department: " + department);
    }
}

// Doctor class
class Doctor extends Employee {
    public Doctor(String name, int id, String department) {
        super(name, id, department);
    }

    public void diagnose() {
        System.out.println(name + " is diagnosing a patient.");
    }
}

// Nurse class
class Nurse extends Employee {
    public Nurse(String name, int id, String department) {
        super(name, id, department);
    }

    public void provideCare() {
        System.out.println(name + " is providing care to a patient.");
    }
}

// Janitor class
class Janitor extends Employee {
    public Janitor(String name, int id, String department) {
        super(name, id, department);
    }

    public void clean() {
        System.out.println(name + " is cleaning the hospital.");
    }
}

// Main class to demonstrate functionality
public class Hospital {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Dr. Smith", 101, "Cardiology");
        Nurse nurse = new Nurse("Alice", 102, "Pediatrics");
        Janitor janitor = new Janitor("John", 103, "Maintenance");

        doctor.displayInfo();
        doctor.diagnose();

        nurse.displayInfo();
        nurse.provideCare();

        janitor.displayInfo();
        janitor.clean();
    }
}
