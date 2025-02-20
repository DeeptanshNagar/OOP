class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // Demonstrate method overloading
        System.out.println("Addition of two integers: " + calc.add(5, 10));
        System.out.println("Addition of two doubles: " + calc.add(5.5, 10.5));
        System.out.println("Addition of three integers: " + calc.add(1, 2, 3));
    }
}