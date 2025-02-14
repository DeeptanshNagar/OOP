// 6th Feb 2025

// write a java program that takes an integer as input and calculates the sum of its digits.

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        sc.close();

        int sum = 0; // sum is initialized to 0 to store the sum of digits.
        int temp = Math.abs(num); 

        while (temp > 0) {
            sum += temp % 10; 
            temp /= 10; // performing integer division.
        }
        // process repeats until all digits are summed.
        System.out.println("Sum of digits: " + sum);
    }
}