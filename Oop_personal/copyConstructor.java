class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    // Student () {                          // explicitly defined constructor 
    //     System.out.println("Constructor called");
    // }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student() {

    }
}

public class copyConstructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;

        // s1.printInfo();

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}