import java.util.Scanner;

public class M5HW2_Molina {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Input Section

        String runAgain = " ";
        runAgain = "yes";
        

        //Constants
        final double baseSalary = 2000.00;
        final double widgetPrice = 4.79;

        //Calculations
        while (runAgain.equals("yes")) {
            System.out.print("Enter the salesperson's name: ");
            String name = keyboard.nextLine();

            int widgetsSold = 0;
            int widgetsReturned = 0;

            //For loop to collect widgets sold 4 weeks
            for (int week = 1; week <= 4; week++) {
                System.out.print("Enter the number of widgets sold in week " + week + ": ");
                widgetsSold += keyboard.nextInt();
            }
            keyboard.nextLine(); // Consume the newline character

            //For loop to collect widgets returned 4 weeks
            for (int week = 1; week <= 4; week++) {
                System.out.print("Enter the number of widgets returned in week " + week + ": ");
                widgetsReturned += keyboard.nextInt();
            }
            keyboard.nextLine(); // Consume the newline character


            //Commission Calculation
            //Net Widgets Sold
            int netWidgets = widgetsSold - widgetsReturned;

            //Widgets Sales Amount
            double widgetsSalesAmount = netWidgets * widgetPrice;

            //Declare commission rate variable
            double commRate;

            if (netWidgets >= 0 && netWidgets <= 100) {
                commRate = 0.10;
            } else if (netWidgets >= 101 && netWidgets <= 199) {
                commRate = 0.15;
            } else if (netWidgets >= 200 && netWidgets <= 299) {
                commRate = 0.20;
            } else {
                commRate = 0.25;
            }

            //Commission Amount
            double commissionAmount = widgetsSalesAmount * commRate;

            //Monthly Salary Calculation
            double monthlySalary = baseSalary + commissionAmount;

            //Output Section
            System.out.println("\nSalesperson: " + name);
            System.out.println("Month #1");
            System.out.println("Widgets Sold: " + widgetsSold);
            System.out.println("Widgets Returned: " + widgetsReturned);
            System.out.println("Net Widgets Sold: " + netWidgets);
            System.out.printf("Widgets Sales Amount: $%.2f%n", widgetsSalesAmount);
            System.out.printf("Commission Amount: $%.2f%n", commissionAmount);
            System.out.printf("Monthly Salary: $%.2f%n", monthlySalary);

            //Prompt to run again. If user enters "yes" the program will run again. If user enters "no" the program outputs "Program exited, Goodbye!" and ends the program.
            System.out.print("\nDo you want to enter data for another salesperson? (yes/no): ");
            runAgain = keyboard.nextLine().toLowerCase();

            if (!runAgain.equals("yes")) {
                System.out.println("Program exited, Goodbye!");
            }

        //end of while loop

        }
        //Close Scanner
        keyboard.close();
    }
}
