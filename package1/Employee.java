package package1;

public class Employee{
    // this instance variable is visible for any child class.
    public String name;
    // salary  variable is visible in Employee class only.
    private double salary;
    // The name variable is assigned a value. 
    public void setName(String empName){
       name = empName;
    }
   // The salary variable is assigned a value.
    public void setSalary(double empSal){
       salary = empSal;
    }
    // This method prints the employee details.
    public void printEmp(){
       System.out.println("name  : " + name );
       System.out.println("salary :" + salary);
    }

    public static void main(String args[]){
        Employee empOne = new Employee();
        Employee empTwo = new Employee();
        empOne.setName("John");
        empTwo.setName("Max");
        empOne.setSalary(1000);
        empTwo.setSalary(2000);
        empOne.printEmp();
        empTwo.printEmp();
     }
  }

