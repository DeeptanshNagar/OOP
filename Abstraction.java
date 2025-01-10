// Abstract Class: Animal
abstract class Animal {
    String name;

    // Constructor for Animal class
    Animal(String name) {
        this.name = name;
    }

    // Abstract method (no implementation)
    abstract void makeSound();

    // Concrete method (implementation provided)
    void eat() {
        System.out.println(name + " is eating");
    }
}

// Subclass: Dog
class Dog extends Animal {
    // Constructor for Dog class
    Dog(String name) {
        super(name);
    }

    // Implementation of abstract method
    void makeSound() {
        System.out.println(name + " barks");
    }
}

// Main class to demonstrate abstraction
public class Abstraction {
    public static void main(String[] args) {
        // Abstract class reference, Dog object
        Animal dog = new Dog("Buddy");
        dog.makeSound(); // Output: Buddy barks
        dog.eat();       // Output: Buddy is eating
    }
}