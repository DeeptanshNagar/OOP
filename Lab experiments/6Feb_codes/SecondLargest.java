import java.util.Scanner;

public class SecondLargest {
   
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) return -1;  // Return -1 if the array is too small

        int largest = arr[0], secondLargest = Integer.MIN_VALUE;
        // Initialize largest with the first element.
        // Initialize secondLargest with the smallest possible integer value (Integer.MIN_VALUE).

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;  // Return -1 if no second largest
        // If secondLargest was never updated, return -1 (no second largest element).
        // Otherwise, return secondLargest.
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Array must have at least two elements.");
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findSecondLargest(arr);
        if (result == -1) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest Element: " + result);
        }

        sc.close();
    }
}
