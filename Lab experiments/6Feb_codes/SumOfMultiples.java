// write a program to find the sum of all integers between 10 and 950 that are divisible by both 6 and 9.

public class SumOfMultiples {
    public static void main(String[] args) {
        int start = 10, end = 950;
        int divisor = 18; // LCM of 6 and 9

        int first = (start + divisor - 1) / divisor * divisor; // First multiple of divisor ≥ start
        int last = (end / divisor) * divisor; // Last multiple of divisor ≤ end

        int n = (last - first) / divisor + 1; // calculates how many 18 exits between first and last

        int totalSum = n * (first + last) / 2;

        
        System.out.println("Sum of integers between 10 and 950 that are divisible by both 6 and 9: " + totalSum);
    }
}