// Write a java program to display name and complete address in different lines. 

import java.util.Scanner;

public class Experiment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your complete address: ");
        String address = scanner.nextLine();

        System.out.println("\nName: " + name);
        System.out.println("Address: " + address);
    }
}
