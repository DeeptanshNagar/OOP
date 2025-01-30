// write a program to implement an command line calculator 
// write a program whether a no is positive negative or zero using if else statements
// create a program that accepts three integers and determines the greatest among them using nested if else statements
// create a program that accepts a number 1 to 7 and displays the corresponding day of the week using switch case statements

// exp 1 - introduction to java environment
// explore and understand the role of jdk jre and jvm
// exp 1 a - install latest available Jdk and verify the java environment 
// exp 1 b - create a simple hello world program using simple text editor notepad and show the steps to compile and execute the program using command prompt
// exp 1 c - display your name and complete address in different lines 


import java.util.*;
public class Experiment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}
class Calculator{
    public int addition(int a,int b)
    {
        return a+b;
    }

    public int subtraction(int a,int b)
    {
        return Math.abs(a-b);
    }
    public int multiplication(int a,int b)
    {
        return a*b;
    }
}