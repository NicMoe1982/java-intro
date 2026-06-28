import java.util.Scanner;

public class M4HW1_Molina {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Input Section
        System.out.print("Enter salesperson name: ");
        String name = keyboard.nextLine();

        System.out.print("Enter widgets sold: ");
        int widgetsSold = keyboard.nextInt();

        System.out.print("Enter widgets returned: ");
        int widgetsReturned = keyboard.nextInt();

        //Constants
        final double baseSalary = 2000.00;
        final double widgetPrice = 4.79;

        //Calculations
        int netWidgets = widgetsSold - widgetsReturned;
        double widgetsSalesAmount = netWidgets * widgetPrice;

        //Commission Calculation
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
        System.out.println("Net Widgets Sold: " + netWidgets);
        System.out.printf("Widgets Sales Amount: $%.2f%n", widgetsSalesAmount);
        System.out.printf("Commission Amount: $%.2f%n", commissionAmount);
        System.out.printf("Monthly Salary: $%.2f%n", monthlySalary);


    }
}
