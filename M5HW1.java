import java.util.Scanner;


public class M5HW1_Molina{

    public static void main(String[] args) {

        //A program that calculates the average of a set of grades and outputs the corresponding letter grade. 
        // The user can run the program multiple times.

        Scanner scanner = new Scanner(System.in);

        char again;

        do {
            System.out.print("Enter the number of grades: ");// accept the number of grades from the user
            int numGrades = scanner.nextInt();

            double sum = 0; // variable to hold the sum of grades

            // Loop to accept grades from the user and calculate the sum
           int i = 0;

           do {
            double grade;

             do {
                System.out.print("Enter grade #" + (i + 1) + ": ");
                grade = scanner.nextDouble();
                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid input. Please enter a grade between 0 and 100.");
                }
             
           } while (grade < 0 || grade > 100);
           sum += grade;
           i++;
        } while (i < numGrades);

        // Calculate the average and determine the letter grade

        double average = sum / numGrades;
        char letterGrade;

        if (average >= 90) {
            letterGrade = 'A';
        }else if (average >= 80){
            letterGrade = 'B';
        }else if (average >= 70){
            letterGrade = 'C';
        }else if (average >= 60){
            letterGrade = 'D';
        }else{
            letterGrade = 'F';
        }
        System.out.printf("Average grade is %.2f\n", average);
        System.out.println("Grade is " + letterGrade);

            System.out.print("Run again? (y/n): ");
            again = scanner.next().charAt(0);
        } while (again == 'y'); 
        
       
        System.out.println("Program exited. Goodbye!");
        

        scanner.close();

    }
}v
