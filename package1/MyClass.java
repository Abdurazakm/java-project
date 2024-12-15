package package1;

// public vs private access. 
public class MyClass { 
    private int alpha; // private access 
    public int beta; // public access 
    public int gamma; // public access 
    //Methods to access alpha. It is OK for a member of a class to //access a private member of the same class. 
    public void setAlpha(int a) { 
       alpha = a; 
    } 
    public int getAlpha() { 
       return alpha; 
    } 

 }
 
 