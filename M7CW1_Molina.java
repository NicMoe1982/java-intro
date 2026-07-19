import java.util.Scanner;

public class M7CW1_Assignment_Molina 
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=== Java Function Practice Menu ===");
            System.out.println("1. Add two integers");
            System.out.println("2. Greet user");
            System.out.println("3. Area of a circle");
            System.out.println("4. Larger of two numbers");
            System.out.println("5. Fahrenheit to Celsius");
            System.out.println("6. Show student info");
            System.out.println("7. Discounted price");
            System.out.println("8. Check even or odd");
            System.out.println("9. String length");
            System.out.println("10. Average of three numbers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter two integers: ");
                    int a = input.nextInt(), b = input.nextInt();
                    System.out.println("Sum = " + add(a, b)); // create this method
                }
                case 2 -> {
                    System.out.print("Enter your name: ");
                    String name = input.nextLine();
                    greet(name); // create this method
                }
                case 3 -> {
                    System.out.print("Enter radius: ");
                    double r = input.nextDouble();
                    System.out.println("Area = " + circleArea(r)); // create this method
                }
                case 4 -> {
                    System.out.print("Enter two numbers: ");
                    int x = input.nextInt(), y = input.nextInt();
                    larger(x, y); // create this method
                }
                case 5 -> {
                    System.out.print("Enter Fahrenheit temperature: ");
                    double f = input.nextDouble();
                    System.out.println("Celsius = " + toCelsius(f)); // create this method
                }
                case 6 -> {
                    System.out.print("Enter student name: ");
                    String sname = input.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = input.nextInt();
                    showStudent(sname, grade); // create this method
                }
                case 7 -> {
                    System.out.print("Enter price and discount (%): ");
                    double price = input.nextDouble(), percent = input.nextDouble();
                    System.out.println("Discounted price = " + discounted(price, percent)); // create this method
                }
                case 8 -> {
                    System.out.print("Enter a number: ");
                    int n = input.nextInt();
                    System.out.println("The number is " + isEvenOdd(n)); // create this method, hint use modulus
                }
                case 9 -> {
                    System.out.print("Enter a string: ");
                    String str = input.nextLine();
                    System.out.println("Length = " + strLength(str)); // create this method
                }
                case 10 -> {
                    System.out.print("Enter three integers: ");
                    int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt();
                    System.out.println("Average = " + average(n1, n2, n3)); // create this method
                }
                case 0 -> System.out.println("Exiting program. Goodbye!");
            }
        } while (choice != 0);

        input.close();
    }

    //Methods to be created below

    // Add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Greet user
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }


    // Area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    // Larger of two numbers
    public static void larger(int x, int y) {
        if (x > y) {
            System.out.println(x + " is larger.");
        } else if (y > x) {
            System.out.println(y + " is larger.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }

    // Fahrenheit to Celsius
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Show student info
    public static void showStudent(String name, int grade) {
        System.out.println("Student Name: " + name);
        System.out.println("Grade: " + grade);
    }


    // Discounted price
    public static double discounted(double price, double percent) {
        return price - (price * percent / 100);
    }

    // Check even or odd
    public static String isEvenOdd(int n) {
        return (n % 2 == 0) ? "even" : "odd";
    }

    // String length
    public static int strLength(String str) {
        return str.length();
    }

    // Average of three numbers
    public static double average(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3.0;
    }
}  
