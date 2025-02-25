class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Method to make a sound (can be overridden by subclasses)
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Constructor
    Dog(String name) {
        super(name); // Calling the superclass constructor
    }

    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println(name + " barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.makeSound();
    }
} 