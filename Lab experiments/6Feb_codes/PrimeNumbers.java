public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;

        for (int num = 2; num <= 1000; num++) {
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println("Total prime numbers between 1 and 1000: " + count);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
