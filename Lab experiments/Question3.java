// create a program that accepts three integers and determines the greatest among them using nested if else statements


import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = scanner.nextInt();
        int greatest;
        if (num1 >= num2) {
            if (num1 >= num3) {
                greatest = num1;
            } else {
                greatest = num3;
            }
        } else {
            if (num2 >= num3) {
                greatest = num2;
            } else {
                greatest = num3;
            }
        }
        System.out.println("The greatest number is: " + greatest);
    }
}