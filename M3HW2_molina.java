/*
*
* Write the pseudocode for an algorithm that takes 3 numbers
* from the user and then calculates the average
* Display the average only
*
*/
import java.util.Scanner;


public class M3HW2_molina
{           
            public static void main(String[] args)
{
        // variables
        // Declare Real num1, num2, num3, average
        // java code
        double num1, num2, num3, average;

        // declare the keyboard variable to
        // get input form the keyboard
        // java code
        Scanner keyboard = new Scanner(System.in);

        // input
        // Display "Enter number one: "
        // Input num1
        // Display "Enter number two: "
        // Input num2
        // Display "Enter number three: "
        // Input num3
        // java code
        System.out.print("Enter number one:");
        num1 = keyboard.nextDouble();

        System.out.print("Enter number two:");
        num2 = keyboard.nextDouble();

        System.out.print("Enter number three:");
        num3 = keyboard.nextDouble();

        // calculations
        // Set average = num1 + num2 + num3
        // java code
        average = (num1 + num2 + num3 ) / 3;

        // output
        // Display "The average is ", average
        // java code
        System.out.println("The average is " + average);
        
        // do not worry about how the average looks
        keyboard.close();
}
}
