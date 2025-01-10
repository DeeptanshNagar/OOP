class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Method to make a sound (can be overridden by subclasses)
    void makeSound() {
        System.out.println(name + " makes a sound");
    }

    // Display animal's name
    void display() {
        System.out.println("This is an animal named: " + name);
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

    // Additional method specific to Dog
    void fetch() {
        System.out.println(name + " is fetching a ball!");
    }
}

class Cat extends Animal {

    // Constructor
    Cat(String name) {
        super(name);
    }

    // Overriding the makeSound method
    @Override
    void makeSound() {
        System.out.println(name + " meows");
    }

    // Additional method specific to Cat
    void scratch() {
        System.out.println(name + " is scratching the furniture!");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Create Animal objects
        Animal genericAnimal = new Animal("Generic Animal");
        genericAnimal.makeSound();
        genericAnimal.display();

        // Create Dog object
        Dog dog = new Dog("Buddy ");
        dog.makeSound();
        dog.display();
        dog.fetch();

        // Create Cat object
        Cat cat = new Cat("Whiskers ");
        cat.makeSound();
        cat.display();
        cat.scratch();
    }
}
