package inheritance.overload_and_override;

public class Foo {
    public void display() {
        System.out.println("Display without parameters.");
    }

    public void display(int i) {
        System.out.println("Display with integer: " + i);
    }

    public void display(char ch) {
        System.out.println("Display with character: " + ch);
    }

    public static void main(String[] args) {
        Foo f = new Foo();
        f.display();        // Calls display()
        f.display(10);      // Calls display(int)
        f.display('c');     // Calls display(char)
    }
}

