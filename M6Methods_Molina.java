// Group project starter file
import java.util.Scanner;
class M6Method_Molina 
{
    static Scanner in = new Scanner( System.in );

    public static void main(String[] args)
    {
        runProgram();
    }

    public static void runProgram()
    {
        System.out.println("Method Project");
        String keep_going = "yes";
        while(keep_going.equalsIgnoreCase("yes"))
        {
            displayMenu();
            System.out.println();
            System.out.println("You have exited the menu!");
            System.out.print("Do you want to see the menu again? Enter yes or no: ");
            keep_going = in.next();
            System.out.println();
        }
        in.close();
        System.out.println("Program has terminated!");
    }

    public static void displayMenu()
    {
        System.out.println();
        System.out.println("Menu");
        System.out.println(); 
        System.out.println("1) M6HW1: Gross Pay Calculator");
        System.out.println("2) M6HW2: Water Bill Calculator");
        System.out.println("3) M6HW3: Monthly Commission Calculator");
        System.out.println("4) Exit");
        System.out.println();
        System.out.print( "Selection: " );
        // change the cases below to better reflect the programs you are running
        switch ( in.nextInt() )
        {
            case 1:
                getM6HW1();
                displayMenu(); // be sure to display menu again after you run this method
                break;
            case 2:
                getM6HW2();
                displayMenu(); // be sure to display menu again after you run this method
                break;
            case 3:
                getM6HW3();
                displayMenu(); // be sure to display menu again after you run this method
                break;
            case 4:
                System.out.println("");
                System.out.println( "Exiting the menu" ); // leave the menu
                break;
            default:
                System.out.println("");
                System.out.println( "Unrecognized option..Try again" );
                System.out.println("");
                displayMenu(); // be sure to display menu again after you run this method
                //break;
        }
    }

    public static void getM6HW1()
    {
        System.out.println("");
        System.out.println("");
        System.out.println( "You picked M6HW1" );
        System.out.println( "" );
        
        //A program that calculates the gross pay for an employee.

        // Prompt the user for their name
        in.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter your name: ");
        String name = in.nextLine();

        // Prompt the user for their hourly rate
        System.out.print("Enter your hourly rate: ");
        double hourlyRate = in.nextDouble();

        // Prompt the user for the number of hours worked
        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = in.nextDouble();

        // Calculate the gross pay
        double grossPay = hourlyRate * hoursWorked;

        // Display the employee's name, Pay Rate, Hours Worked, and Gross Pay
        System.out.println("Employee Name: " + name);
        System.out.println("Pay Rate: $" + hourlyRate);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Gross Pay: $" + grossPay);

        }

    public static void getM6HW2()
    {
        System.out.println("");
        System.out.println("");
        System.out.println( "You picked M6HW2" );
        System.out.println( "" );
        
        //A program that calculates a homeowner's water bill.

         //Prompt user for their name, previous water usage, and current water usage
        in.nextLine(); // Consume the newline character left by nextInt()
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter the previous water usage (in gallons): ");
        double previousUsage = in.nextDouble();
        System.out.print("Enter the current water usage (in gallons): ");
        double currentUsage = in.nextDouble(); 

        //Calculate the water bill based on the usage
        double waterUsage = currentUsage - previousUsage;  
        double waterBill = waterUsage * 0.20 + 50; // $0.20 per gallon plus a base fee of $50

        //Display the homeowner's name, previous usage, current usage, water usage, and Total water bill
        System.out.println("Homeowner Name: " + name);
        System.out.println("Previous Usage: " + previousUsage + " gallons");
        System.out.println("Current Usage: " + currentUsage + " gallons");
        System.out.println("Water Usage: " + waterUsage + " gallons");
        System.out.println("Total Water Bill: $" + waterBill);
        
    }

    public static void getM6HW3()
    {
        System.out.println("");
        System.out.println("");
        System.out.println( "You picked M6HW3" );
        System.out.println( "" );
        
        //A program that calculates the monthly commission for an employee based on the number of widgets sold and returned.

         //Prompt user for their name, number of widgets sold, number of widgets returned.
        in.nextLine(); // Consume the newline character left by nextInt()
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

    }
}
