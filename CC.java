class Student{
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
    }
    public void display(){
        System.out.println("Name: " + name + ",Age: " + age);
    }
}
public class CC{
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 12);
        student1.display();

        Student student2 = new Student(student1);
        student2.display();

        System.out.println((student1==student2));
    }

}