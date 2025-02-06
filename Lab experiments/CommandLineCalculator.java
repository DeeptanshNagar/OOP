// write a program to implement an command line calculator 
// write a program whether a no is positive negative or zero using if else statements
// create a program that accepts three integers and determines the greatest among them using nested if else statements
// create a program that accepts a number 1 to 7 and displays the corresponding day of the week using switch case statements

// exp 1 - introduction to java environment
// explore and understand the role of jdk jre and jvm
// exp 1 a - install latest available Jdk and verify the java environment 
// exp 1 b - create a simple hello world program using simple text editor notepad and show the steps to compile and execute the program using command prompt
// exp 1 c - display your name and complete address in different lines 


public class CommandLineCalculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("give the first number, operator and next number");
            return;
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            char operator = args[1].charAt(0);
            int num2 = Integer.parseInt(args[2]);
            int result = 0;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator.");
                    return;
            }

            System.out.println("Answer: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}