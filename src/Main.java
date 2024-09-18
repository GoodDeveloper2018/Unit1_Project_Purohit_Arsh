import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Introduction to Tip calculator
        System.out.println("\033[0;1m" + "Welcome to Tip Calculator");

        // Create new Scanner to take input of subtotal amount
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the subtotal
        System.out.println("Please Enter your Subtotal: ");
        double subTotal = scanner.nextDouble();

        // Prompt for tip percentages
        System.out.println("Enter tip percentages (space-separated, e.g., '10 15 20'): ");
        scanner.nextLine(); // Consume the leftover newline
        String input = scanner.nextLine();

        // Split input into an array of strings and convert to double
        String[] tipValues = input.split(" ");
        double[] tips = new double[tipValues.length];

        for (int i = 0; i < tipValues.length; i++) {
            tips[i] = Double.parseDouble(tipValues[i]);
        }

        // Calculate and print total bill for each tip value
        System.out.println("\nTotal bills for each tip percentage:");
        for (double tip : tips) {
            double totalBill = subTotal + (subTotal * tip / 100);
            System.out.printf("With a %.2f%% tip: $%.2f%n", tip, totalBill);
        }
    }
}