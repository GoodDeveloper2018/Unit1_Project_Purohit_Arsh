import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Introduction to Tip calculator
        System.out.println("\033[0;1m" + "Welcome to Tip Calculator\n");

        // Create new Scanner to take input of subtotal amount
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the subtotal
        System.out.print("Please Enter your Subtotal: ");
        double subTotal = scanner.nextDouble();

        // Prompt the user to enter the number of people
        System.out.print("Enter the number of people: ");
        int numberOfPeople = scanner.nextInt();

        // Prompt for tip percentages
        System.out.print("Enter tip percentages (space-separated, e.g., '10 15 20'): ");
        scanner.nextLine(); // Consume the leftover newline
        String input = scanner.nextLine();

        // Split input into an array of strings and convert to double
        String[] tipValues = input.split(" ");
        double[] tips = new double[tipValues.length];

        for (int i = 0; i < tipValues.length; i++) {
            tips[i] = Double.parseDouble(tipValues[i]);
        }

        // Generate receipt animation
        System.out.println("\nGenerating receipt...\n");

        // Receipt Title
        drawHorizontalLine(40);
        System.out.println(centerText("|     RECEIPT - TIP CALCULATOR     |", 40));
        drawHorizontalLine(40);

        // Print the subtotal in receipt format
        Thread.sleep(300);
        System.out.println(centerText("| Subtotal: $" + String.format("%.2f", subTotal) + "            |", 40));

        // Divider line
        drawHorizontalLine(40);

        // Calculate and print total and per-person tip for each tip value with animation
        for (double tip : tips) {
            double totalBill = subTotal + (subTotal * tip / 100);
            double perPersonTip = (subTotal * tip / 100) / numberOfPeople;
            double perPersonTotal = totalBill / numberOfPeople;

            Thread.sleep(300);
            System.out.println(centerText(String.format("| Tip @ %.2f%% : Total $%.2f    |", tip, totalBill), 40));
            System.out.println(centerText(String.format("| Per Person Tip: $%.2f     |", perPersonTip), 40));
            System.out.println(centerText(String.format("| Per Person Total: $%.2f   |", perPersonTotal), 40));
            drawHorizontalLine(40);
        }

        // Thank you message at the end of the receipt
        Thread.sleep(300);
        System.out.println(centerText("|  THANK YOU FOR USING OUR SERVICE   |", 40));
        drawHorizontalLine(40);

        // Close the scanner
        scanner.close();
    }

    // Method to draw horizontal lines with animation
    public static void drawHorizontalLine(int length) throws InterruptedException {
        System.out.print("+");
        for (int i = 0; i < length; i++) {
            System.out.print("-");
            Thread.sleep(20); // Adjust the speed of the animation
        }
        System.out.println("+");
    }

    // Helper method to center text within a given length for proper alignment
    public static String centerText(String text, int totalLength) {
        int padding = (totalLength - text.length()) / 2;
        StringBuilder centeredText = new StringBuilder();

        for (int i = 0; i < padding; i++) {
            centeredText.append(" ");
        }

        centeredText.append(text);

        for (int i = 0; i < padding; i++) {
            centeredText.append(" ");
        }

        // Ensure the line is exactly the totalLength
        if (centeredText.length() < totalLength) {
            centeredText.append(" ");
        }

        return centeredText.toString();
    }
}
