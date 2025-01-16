// Write a java program to display name and complete address in different lines. 

import java.util.Scanner;

public class DisplayNameAndAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your complete address: ");
        String address = scanner.nextLine();

        System.out.println("\nName: " + name);
        System.out.println("Address: " + address);

        scanner.close();
    }
}

// experi 2 - 
// 1. write a program to find the area of a triangle 
// 2. write a program to compute simple interest 
