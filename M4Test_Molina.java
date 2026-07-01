//Nicholas Molina
//M4 Hands-On Test
//July 1, 2026
//This program helps the user decide what to wear based on the temperature outside. The user will input the temperature and the program will output a suggestion of what to wear.
import java.util.Scanner;

public class M4Test_Molina {

    public static void main(String[] args) {

        //Input Section
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in degrees Fahrenheit: ");
        int temperature = scanner.nextInt();

        //Output Section
        if (temperature > 0 && temperature < 32) {
            System.out.println("Freezing - bundle up!");
        } else if (temperature > 32 && temperature < 50) {
            System.out.println("Cold - wear a jacket.");
        } else if (temperature > 51 && temperature < 70) {
            System.out.println("Mild - a light sweater will do.");
        } else if (temperature > 71 && temperature < 90) {
            System.out.println("Warm - enjoy the day.");
        } else if (temperature > 90) {
            System.out.println("Hot - stay hydrated.");

        //This else statement is used to catch any negative input that may have been entered by the user. It will prompt the user to double-check their entry.
        } else {
            System.out.println("Unusual input detected. Double-check your entry.");
        }

        scanner.close();
    }
}
