import java.util.Scanner;

public class M7HW1_Molina {

    public static void main(String[] args) {

        runProgram();
    }
    public static void runProgram() {
        Scanner k = new Scanner(System.in);
        String keep_going = "yes";

        final double baseSalary = 2000.00;
        final double widgetPrice = 4.79;
        
        while(keep_going.equalsIgnoreCase("yes")) 
        {
            displayInfo();
            
            System.out.print("Enter the salesperson's name: ");
            String userName = k.nextLine();

            int widgetsSold = getSales(k);
            int widgetsReturned = getReturns(k);

            int netWidgets = calWidSold(widgetsSold, widgetsReturned);
            double widgetsSalesAmount = calWidSalesAmt(netWidgets, widgetPrice);
            double commissionAmount = calComm(widgetsSalesAmount, netWidgets);
            double monthlySalary = calSalary(baseSalary, commissionAmount);

            displayValues(userName, widgetsSold, widgetsReturned, netWidgets, widgetsSalesAmount, commissionAmount, monthlySalary);
           
            System.out.println();
            System.out.print("Do you want to run the program again? Enter yes or no: ");
            keep_going = k.next();
            System.out.println();
        }
    k.close();
    System.out.println("Program has terminated!");
    }

    //Displays your name and the problem description
    public static void displayInfo()
    {
        System.out.println();
        System.out.println("Welcome to the Salesperson Salary Calculator!");
        System.out.println();
    }

    //Collects and returns weekly sales
    public static int getSales(Scanner k) {
        int widgetsSold = 0;
        for (int week = 1; week <= 4; week++) {
            System.out.print("Enter the number of widgets sold in week " + week + ": ");
            widgetsSold += k.nextInt();
        }
        k.nextLine(); // Consume the newline character
        return widgetsSold;
    }

    //Collects and returns weekly returns
    public static int getReturns(Scanner k) {
        int widgetsReturned = 0;
        for (int week = 1; week <= 4; week++) {
            System.out.print("Enter the number of widgets returned in week " + week + ": ");
            widgetsReturned += k.nextInt();
        }
        k.nextLine(); 
        return widgetsReturned;

    }

    //Calculates and returns total widgets sold (sales – returns)
    public static int calWidSold(int widgetsSold, int widgetsReturned) {
        return widgetsSold - widgetsReturned;
    }

    //Calculates and returns total widget sales amount
    public static double calWidSalesAmt(int netWidgets, double widgetPrice) {
        return netWidgets * widgetPrice;
    }

    //Calculates and returns commission amount
    public static double calComm(double widgetsSalesAmount, int netWidgets) {
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
        
        return widgetsSalesAmount * commRate;
    }

    //Calculates and returns monthly salary (base = 2000)
    public static double calSalary(double baseSalary, double commissionAmount) {
        return baseSalary + commissionAmount;
    }

    //Displays all final claculated values
    public static void displayValues(String name, int widgetsSold, int widgetsReturned, int netWidgets, double widgetsSalesAmount, double commissionAmount, double monthlySalary) {
        System.out.println("Salesperson: " + name);
        System.out.println("Widgets Sold: " + widgetsSold);
        System.out.println("Widgets Returned: " + widgetsReturned);
        System.out.println("Net Widgets: " + netWidgets);
        System.out.println("Widgets Sales Amount: $" + String.format("%.2f", widgetsSalesAmount));
        System.out.println("Commission Amount: $" + String.format("%.2f", commissionAmount));
        System.out.println("Monthly Salary: $" + String.format("%.2f", monthlySalary));
    }
}
