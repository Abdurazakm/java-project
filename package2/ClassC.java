package package2;

import package1.ClassA;
//by using extend we can access protected class from other package
public class ClassC extends ClassA {
    public static void main(String[] args) {
        ClassC prot = new ClassC();
        prot.display();
    }
}
