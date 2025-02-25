abstract class Animal {
    String name; 
    Animal(String name) {
        this.name = name;
    }
    abstract void makeSound();

    void eat() {
        System.out.println(name + " is eating !! ");
    }
}

class Dog extends Animal{
    Dog(String name) {
        super(name);
    }
    void makeSound() {
        System.out.println(name + " is barking...");
    }
}
public class Abstraction{
    public static void main(String[] args) {
        Animal d = new Dog("sandy");
        d.eat();
        d.makeSound();
    }
}