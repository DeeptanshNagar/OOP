// Create a student class with attributes for - name and age . implement a default constructor to assign default values and a parameterized constructer to initialize the attributes with user defined values .Create objects using both constructors and display their details.

class Student {
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Deeptansh Nagar";
        this.age = 19;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        Student student1 = new Student();
        student1.display();

        // Creating an object using the parameterized constructor
        Student student2 = new Student("Vanshika", 21);
        student2.display();
    }
}

