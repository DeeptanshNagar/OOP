class Example {
    int num;

    // Constructor 1
    public Example() {
        this(5); // Calls Constructor 2
        System.out.println("Default Constructor");
    }

    // Constructor 2
    public Example(int n) {
        this.num = n;
        System.out.println("Parameterized Constructor: " + n);
    }

    public static void main(String[] args) {
        Example ex = new Example();
        // Output:
        // Parameterized Constructor: 5
        // Default Constructor
    }
}
