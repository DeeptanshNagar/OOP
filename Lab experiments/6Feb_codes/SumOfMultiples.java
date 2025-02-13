// 6th Feb 2025

// write a program to find the sum of all integers between 10 and 950 that are divisible by both 6 and 9.

public class SumOfMultiples {
    public static void main(String[] args) {
        int start = 10, end = 950;
        int divisor = 18; // LCM of 6 and 9

        int first = (start + divisor - 1) / divisor * divisor; 
        int last = (end / divisor) * divisor;

        int n = (last - first) / divisor + 1; 

        int totalSum = n * (first + last) / 2; // arithmetic progression formula

        
        System.out.println("Sum of integers between 10 and 950 that are divisible by both 6 and 9: " + totalSum);
    }
}
