package q;

import p.A;

public class b extends A {
    public static void main(String[] args) {
        A obj = new A();

        obj.publicMethod();  // Allowed (public)

        // obj.protectedMethod();  //Not allowed without inheritance
        // obj.defaultMethod();  Not allowed (default access)
        // obj.privateMethod();  Not allowed (private access)

        // Using inheritance to access protected method
        b objB = new b();
        objB.protectedMethod(); // Allowed (protected via inheritance)
    }
}