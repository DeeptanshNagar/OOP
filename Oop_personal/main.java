class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing");
    }
    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}


public class main {
    public static void main(String[] args) {
        /* 
        Pen p1 = new Pen();
        p1.color = "Red";
        p1.type = "Ballpoint";

        // System.out.println(p1.color);
        // System.out.println(p1.type);
        p1.write();
        p1.printColor();

        Pen p2 = new Pen();
        p2.color = "Blue";
        p2.type = "Gel";
        p2.printColor();
        */

        Student s1 = new Student();
        s1.name = "John";
        s1.age = 20;

        s1.printInfo();
    }
}
