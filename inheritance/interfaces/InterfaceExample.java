package inheritance.interfaces;

// Define an interface
interface Animal {
    void makeSound(); // Abstract method
    void move();      // Abstract method
}

// Implement the interface in a class
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    public void move() {
        System.out.println("Dog runs");
    }
}

// Another class implementing the same interface
class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }

    @Override
    public void move() {
        System.out.println("Bird flies");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        dog.makeSound();
        dog.move();

        bird.makeSound();
        bird.move();
    }
}

