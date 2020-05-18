import java.util.Scanner;

public class Question_20 {
    public static void main(final string[] args) {
        final Scanner input = new Scanner(System.in);

        // Prompt the user to enter a balance and
        // the annual percentage interest rate
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        final double balance = input.nextDouble();
        final double annualInterestRate = input.nextDouble();

        // Calculate the interest
        final double interest = balance * (annualInterestRate / 1200);

		// Display result
		System.out.println("The interest is " + interest);
    }
}