import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        //Introduction to Tip calculator
        System.out.println("\033[0;1m" + "Welcome to Tip Calculator");
        //Creates new Scanner to take input of subTotal amount
        Scanner subTotal = new Scanner(System.in);
        //Sout statement for user to input SubTotal
        System.out.println("Please Enter your Subtotal: ");

        //Create new scanner to take in tip inputs
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("What is your tip percentage (or range of values): ");
        String[] numTipValues = input.split(" ");
        scanner.nextLine();
        System.out.println(numTipValues[0]);

        int len = numTipValues.length;
        double[] numbers = new double[len];

        for (int i = 0; i < len; i++) {
            numbers[i] = Double.parseDouble(numTipValues[i]);
        }

    }
}