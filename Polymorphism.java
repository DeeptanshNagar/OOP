// Class: Calculator
class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

// Main class to demonstrate polymorphism
public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling different overloaded methods
        System.out.println("Sum of 2 integers: " + calc.add(5, 10)); // Output: 15
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15)); // Output: 30
        System.out.println("Sum of 2 double values: " + calc.add(5.5, 10.2)); // Output: 15.7
    }
}