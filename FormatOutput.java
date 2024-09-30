import java.util.Scanner;

public class FormatOutput {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Input: Floating-point number
        System.out.print("Enter a floating-point number: ");
        double floatNum = scanner.nextDouble();
        
        // Input: String
        System.out.print("Enter a string: ");
        String text = scanner.next();
        
        // Input: Integer
        System.out.print("Enter an integer: ");
        int intNum = scanner.nextInt();
        
        // Print formatted output
        System.out.printf("%.3f %-15s %016d\n", floatNum, text, Integer.parseInt(Integer.toBinaryString(intNum)));
    }
}
