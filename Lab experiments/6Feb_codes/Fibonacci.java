import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = input.nextInt(); // Reads the integer value of n and closes the scanner
        input.close();
        
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + " " + second);
        
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}