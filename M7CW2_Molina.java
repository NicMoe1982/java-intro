/**
    * M7CW2_Molina.java
    * This program calculates the area and hypotenuse of a right triangle
    * Nicholas Molina
    * CIS-115
 */
import java.util.Scanner;

public class M7CW2_Molina 
{

    public static void main(String[] args)
    {
        runProgram();
    }
    public static void runProgram()
    {
        Scanner k = new Scanner(System.in);  
        String keep_going = "yes";
        
        System.out.print("Enter your name: ");
        String userName = k.nextLine();

        while(keep_going.equalsIgnoreCase("yes"))
        {
            displayInfo(userName);
                
            int SideA = getSideA(k);
            int SideB = getSideB(k);
            int area = calArea(SideA,SideB);
            double hypotenuse = calHypotenuse(SideA,SideB);
            displayValues(SideA, SideB, area, hypotenuse);
                
            System.out.println();
            System.out.print("Do you want to see the menu again? Enter yes or no: ");
            keep_going = k.next();
            System.out.println();
        }
    k.close();
    System.out.println("Program has terminated!");
    }

    //These methods will be called from runProgram() method to get the values of sideA, sideB, area and hypotenuse
    public static void displayInfo(String userName)
    {
        // displayInfo() method will display the welcome message and the name of the user
        System.out.println();
        System.out.println("Hi, " + userName);
        System.out.println();
    }
    public static int getSideA(Scanner in)
    {
        // getSideA() method will ask the user to enter the value of sideA and return the value
       System.out.print("Enter side A of the right triangle: ");
        int sideA = in.nextInt();
       return sideA; 
    }
    public static int getSideB(Scanner in)
    {
        // getSideB() method will ask the user to enter the value of sideB and return the value
       System.out.print("Enter side B of the right triangle: ");
        int sideB = in.nextInt();
       return sideB; 
    }
    public static int calArea( int a, int b)
    {
        // calArea() method will calculate the area of the right triangle and return the value
       return (a*b)/2; 
    }
    public static double calHypotenuse( double a, double b)
    {
        // calHypotenuse() method will calculate the hypotenuse of the right triangle and return the value
       return Math.hypot(a, b);
       
    }

    // displayValues() method will display the values of sideA, sideB, area and hypotenuse
    public static void displayValues(int sideA, int sideB, int area, double hypotenuse)
    {
        System.out.println();
        System.out.println("Side A is " + sideA);
        System.out.println("Side B is " + sideB);
        System.out.println("Area is " + area);
        System.out.println("Hypotenuse is " + hypotenuse);
        System.out.println();
    }

}
