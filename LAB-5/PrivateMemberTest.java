class Parent {
    private String privateMessage = "This is a private message";
}
class Child extends Parent {
    public void display() {
        // System.out.println(privateMessage); // This will cause a compilation error
        System.out.println("Cannot access private members directly.");
    }
}
public class PrivateMemberTest {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}