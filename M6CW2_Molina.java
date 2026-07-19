import java.util.Scanner;

// This program calculates the area of a rectangle based on user input for length and width.


public class M6CW2_Molina {
    
public static void main(String[] args){
    // Call the methods to display greeting, calculate area, and display closing message
    displayGreeting();
    calculateArea();
    displayClosing();
    }

    public static void displayGreeting(){
        // Display a greeting message to the user
        System.out.println("Welcome to the Area Calculator!");
    }

    public static void calculateArea(){
        // Prompt the user for the length and width of a rectangle and calculate the area
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length = in.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = in.nextDouble();
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }

    public static void displayClosing(){
        // Display a closing message to the user
        System.out.println("Thank you for using this program!");
    }  
}
