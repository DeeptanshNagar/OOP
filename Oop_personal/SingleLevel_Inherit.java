class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);    
    }
}

class equilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}
public class SingleLevel_Inherit {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(10, 20);
    }
}
