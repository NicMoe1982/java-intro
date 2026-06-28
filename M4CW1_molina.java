import java.util.Scanner;

public class M4CW1_molina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // Variables
        int majors; // Number of CS majors
        int nonmajors; // Number of nonmajors
        double total; // Total number of students
        double percentMajors; // Percentage of CS majors
        double percentNonmajors; // Percentage of nonmajors

// Get the number of majors.
        System.out.print("Enter the number of students majoring in CS: ");
        majors = scanner.nextInt();

// Get the number of nonmajors.
        System.out.println("Enter the number of non-computer science students: ");
        nonmajors = scanner.nextInt();

// Calculate the total number of students.
        total = majors + nonmajors;

// Calculate the percentage of majors.
        percentMajors = majors / total * 100;

// Calculate the percentage of nonmajors.
        percentNonmajors = nonmajors / total * 100;

// Display the percentage of majors.
        System.out.printf("Majors: %.2f%%%n", percentMajors);
            // %.2f = format as a floating‑point number with 2 digits after the decimal
            // %%  = print a literal percent sign
            // %n  = platform‑independent newline

// Display the percentage of nonmajors.
        System.out.printf("Nonmajors: %.2f%%%n", percentNonmajors);
    }
    
}
