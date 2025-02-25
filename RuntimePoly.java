class Animal{
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Monkey extends Animal {
    @Override
    void makeSound() {
        System.out.println("Monkey makes a sound");
    }
}
class Donkey extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dhenchu Dhenchu Dhenchu!!!");
    }
}

public class RuntimePoly {
    public static void main(String[] args) {
        // reference of animal class but object of monkey class
        Animal myAnimal = new Monkey();
        myAnimal.makeSound();

        // reference of animal class but object of donkey class
        // Animal myAnimal = new Donkey();                                     // error 
        myAnimal = new Donkey();
        myAnimal.makeSound();
    }
}
