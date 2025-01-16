import java.util.Scanner;

public class Experiment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        int base = scanner.nextInt();
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();
        double area = 0.5 * base * height;
        System.out.printf("The area of the triangle is: %.2f\n", area);
    }
}

