package inheritance.overload_and_override;

class Animal {
    public void sound() {
        System.out.println("Animals make sounds");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cats meow");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dogs bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.sound(); // Output: Cats meow
        animal2.sound(); // Output: Dogs bark
    }
}
