import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("\033[0;1m" + "Welcome to Tip Calculator");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your Subtotal: ");
        String bill = scanner.nextLine();

        String input = scanner.nextLine();
        String[] numTipValues = input.split(" ");
        System.out.println("What is your tip percentage (or range of values): ");

        int len = numTipValues.length;
        double[] numbers = new double[len];

        for (int i = 0; i < len; i++) {
            numbers[i] = Double.parseDouble(numTipValues[i]);
        }

        numbers.stream().mapToInt(Integer::intValue).sum();
        numbers.stream().reduce(1, (a,b) -> a*b)};
    }
}