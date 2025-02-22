// Write a Java program to count and display the total number of prime numbers between 1
// and 1000

public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0; // count is initialized to store the number of prime numbers found.

        for (int num = 2; num <= 1000; num++) {
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println("Total prime numbers between 1 and 1000: " + count);
    }

    // helper function that checks whether a given number n is prime 
    public static boolean isPrime(int n) {
        if (n < 2) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(n); i++) { // Check for factors from 2 to sqrt(n)
            if (n % i == 0) {
                return false; // n is divisible by i, so it's not prime
            }
        }
        return true; // n is prime
    }
}