package inheritance;

class Poly1 {
    public final String greeting() { 
        return "Again"; 
    }
}
public class Poly2 extends Poly1 {
    public final String greeting() { 
        return "Hello!"; 
    }
    public static void main(String[] args) {
        Poly1 p1 = new Poly2();
        Poly2 p2 = new Poly2();
        System.out.println(p1.greeting() + " " + p2.greeting());
    }
}
