import java.util.Scanner;

public class Experiment3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        int principal = scanner.nextInt();
        System.out.print("Enter the rate of interest (annual): ");
        int rate = scanner.nextInt();
        System.out.print("Enter the time (in years): ");
        int time = scanner.nextInt();
        float simpleInterest = (principal * rate * time) / 100;
        System.out.printf("The simple interest is: %.2f\n", simpleInterest);
    }
}

