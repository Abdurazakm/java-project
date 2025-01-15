package inheritance.overload_and_override;

class Animal {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Animal {
    @Override
    public void move() {
        System.out.println("Dogs can walk and run");
    }
}

public class TestDog {
    public static void main(String[] args) {
        Animal a = new Animal(); // Reference and object of Animal
        Dog b = new Dog();       // Reference and object of Dog

        a.move(); // Calls Animal's move()
        b.move(); // Calls Dog's move()
    }
}

