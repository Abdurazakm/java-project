package Exception;

public class CircleWithException {
     private double radius;
     // Construct a circle with a specified radius 
     public CircleWithException(double newRadius) {
            setRadius(newRadius);
      }
      /** Return radius */
      public double getRadius() {
           return radius;
      } 
         /** Set a new radius */
public void setRadius(double newRadius)
throws IllegalArgumentException{
if (newRadius >= 0)
      radius = newRadius;
else
      throw new IllegalArgumentException("Radius cannot be negative");
}

/** Return the area of this circle */
public double findArea() {
return radius * radius * 3.14159;
}
}

public class TestCircleWithException {
     public static void main(String[] args) {
          try{
                CircleWithException c1 = new CircleWithException(5);
                 CircleWithException c2 = new CircleWithException(-5);
                 CircleWithException c3 = new CircleWithException(0);

       }
       catch(IllegalArgumentException ex){
             System.out.println(ex);
       }
     }
}
// Output:
// java.lang. IllegalArgumentException : Radius cannot be negative
