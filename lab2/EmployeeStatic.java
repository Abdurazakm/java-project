public class EmployeeStatic {
   private String firstName;
   private String lastName;
   private static int count = 0; // number of objects in memory
   public EmployeeStatic( String first, String last ) {
      firstName = first;
      lastName = last;
      count++;
      System.out.println( "Employee constructor:" +  firstName + lastName +";count= " + count );
   }
   public String getFirstName() {
      return firstName;

    
}
public String getLastName(){
    return lastName;
  } // end method getLastName
   public static int getCount()    {
      return count;
  }
  public static void main( String args[] ) {
    // show that count is 0 before creating Employees
    System.out.println( "Employees before instantiation: " +    
    EmployeeStatic.getCount());
     // create two Employees; count should be 2
    EmployeeStatic e1 = new EmployeeStatic( "Susan", "Baker");
    EmployeeStatic e2 = new EmployeeStatic( "Bob", "Blue" );
    // show that count is 2 after creating two Employees
     System.out.println( "\nEmployees after instantiation: " );
     System.out.println( "via e1.getCount():"  + e1.getCount()  );
    System.out.println( "via e2.getCount():" + e2.getCount());
    System.out.println( "via Employee.getCount():"+ EmployeeStatic.getCount());
    // get names of Employees
    System.out.println( "Employee 1: "+ e1.getFirstName()+ " " + e1.getLastName());
    System.out.println( "Employee 2: "+ e2.getFirstName()+ " " + e2.getLastName());
    } // end main
} // end class EmployeeStaticTest




