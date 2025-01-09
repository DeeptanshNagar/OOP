class Main {
    // Private fields for encapsulation
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) {  // Add validation for non-negative age
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Main method to demonstrate the usage
    public static void main(String[] args) {
        Main person = new Main();  // Create an instance of Main
        person.setName("John Doe");  // Set name
        person.setAge(25);  // Set age

        // Display the name and age
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Attempt to set an invalid age
        person.setAge(-5);  // Should display an error message
    }
}