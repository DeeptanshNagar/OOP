import java.util.Scanner;

class Calculator2 {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator2 calc = new Calculator2();

        System.out.print("Enter two integers: ");
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        System.out.println("Sum of two integers: " + calc.add(int1, int2));

        System.out.print("Enter two doubles: ");
        double double1 = sc.nextDouble();
        double double2 = sc.nextDouble();
        System.out.println("Sum of two doubles: " + calc.add(double1, double2));

        System.out.print("Enter three integers: ");
        int int3 = sc.nextInt();
        int int4 = sc.nextInt();
        int int5 = sc.nextInt();
        System.out.println("Sum of three integers: " + calc.add(int3, int4, int5));
        
        sc.close();
    }
}
