import java.util.Scanner;

/*
 * Nicholas Molina
 * CIS 115.1901
 * July 15, 2026
 * This program calculates the gross pay for an employee.
 */

public class M6HW1_Molina {
    public static void main(String[] args) {
        // Call the method to calculate the gross pay for an employee
        grossPayCalculator();
    }

    public static void grossPayCalculator() {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for their hourly rate
        System.out.print("Enter your hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        // Prompt the user for the number of hours worked
        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = scanner.nextDouble();

        // Calculate the gross pay
        double grossPay = hourlyRate * hoursWorked;

        // Display the employee's name, Pay Rate, Hours Worked, and Gross Pay
        System.out.println("Employee Name: " + name);
        System.out.println("Pay Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Pay: $" + grossPay);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
