import java.util.Scanner;

/*
 * Nicholas Molina
 * CIS 115.1901
 * July 15, 2026
 * This program calculates the monthly commission for an employee based on the number of widgets sold and returned.
 */

public class M6HW3_Molina {
    
    public static void main(String[] args){
        // Call the method to calculate the employee's monthly commission
        calculateCommission();
    }

    public static void calculateCommission(){
        
        //Prompt user for their name, number of widgets sold, number of widgets returned.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");  
        String name = in.nextLine();
        System.out.print("Enter the number of widgets sold: ");
        int widgetsSold = in.nextInt();
        System.out.print("Enter the number of widgets returned: ");
        int widgetsReturned = in.nextInt();

        //Calculate the net widgets.
        int netWidgets = widgetsSold - widgetsReturned;
        //Calculate the price per widget and monthly commission.
        double monthlyCommission = 500 + (netWidgets * 0.10); // $0.10 per widget plus a base salary of $500

        //Display the employee's name, number of widgets sold, price per widget, and monthly commission
        System.out.println("Employee Name: " + name);
        System.out.println("Net Widgets Sold: " + netWidgets);
        System.out.println("Total Commission: $" + monthlyCommission);

        // Close the scanner to prevent resource leaks
        in.close();
    }  
}
