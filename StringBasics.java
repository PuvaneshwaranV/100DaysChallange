import java.util.Scanner;

public class StringBasics{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Accept inputs from the user
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter height (in meters): ");
        float height = scanner.nextFloat();

        System.out.print("Is the person a student (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Determine if the person is a student or not
        String studentStatus = isStudent ? "Student" : "Non-student";

        // Print the output in a grammatically correct sentence
        System.out.printf("%s is %d years old, %.2f meters tall, and is a %s.%n", name, age, height, studentStatus);
        
        // Close the scanner
        scanner.close();
    }
}
