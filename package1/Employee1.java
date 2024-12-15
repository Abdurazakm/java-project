package package1;

public class Employee1 {
    // salary variable is a private static variable
    private static double salary;
    // DEPARTMENT is a constant
    public static String DEPARTMENT = "Develpment";
    //this instance variable is visible for any child class
    public String name;
    public static double initialsalary;
    //The name varaible is assigned in the constructor
    public Employee1(String empName){
        name = empName;
    }
    // The salary variable is assigned a value
    public void setSalary(double empSal){
        initialsalary = empSal;
    }
    //This method prints the employee details.
    public void printEmp(){
        System.out.println("name: "+name);
        System.out.println("initial salary: "+initialsalary);
    }

    public static void main(String[] args) {
        Employee1 empone = new Employee1("Abdurazak");
        empone.setSalary(1000);
        empone.printEmp();
        salary = 1000;
        System.out.println(DEPARTMENT + " average salary: " + salary);
    }

}
