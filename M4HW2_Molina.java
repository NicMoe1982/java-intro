import java.util.Scanner;

public class M4HW2_Molina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input Section
        System.out.print("Enter your age: ");
        int ageOnElectionDay = scanner.nextInt();

        System.out.print("Are you a U.S. citizen? (true/false): ");
        boolean isCitizen = scanner.nextBoolean();

        System.out.print("How many days have you lived in your county? ");
        int daysInCounty = scanner.nextInt();

        System.out.print("Are you currently serving a sentence for a felony? (true/false): ");
        boolean isFelonServingSentence = scanner.nextBoolean();

        //Eligibility Check
        if (isCitizen == true) {
            if (ageOnElectionDay >= 18) {
                if (daysInCounty >= 30) {
                    if (isFelonServingSentence == false) {
                        System.out.println("The potential voter CAN vote in North Carolina.");
                    } else {
                        System.out.println("The potential voter CANNOT vote: currently serving a felony sentence.");
                    }
                } else {
                    System.out.println("The potential voter CANNOT vote: must live in the county at least 30 days.");
                }
            } else {
                System.out.println("The potential voter CANNOT vote: must be 18 years old.");
            }
        } else {
            System.out.println("The potential voter CANNOT vote: must be a U.S. citizen.");
        }

        scanner.close();
    }
}
