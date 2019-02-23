import java.util.Scanner;

public class Task2_4 {

	public static void main(String[] args) {

		int lowerLim = enterNumber("Lower limit");
		int upperLim = enterNumber("Upper limit");

		if (lowerLim < upperLim) {
			for (int i = lowerLim; i < upperLim - 1; i++) {
				for (int j = i + 1; j <= upperLim; j++) {
					checkforFriendship(i, j);
				}
			}
		} else {
			System.out.println("Limits are entered wrong!");
		}
	}

	public static int enterNumber(String str) {
		int number = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter " + str + ": ");

		while (!scanner.hasNextInt()) { // checking that user entered a number
			System.out.println("It should  be a number !!!");
			System.out.print("Enter number AGAIN: ");
			scanner.next();
		}
		number = scanner.nextInt();

		while (number <= 0) { // checking that user entered CORRECT number
			System.out.println("It should  be a positive number !!!");
			System.out.print("Enter number AGAIN: ");

			number = scanner.nextInt();
		}
		return number;
	}

	private static void checkforFriendship(int num1, int num2) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				sum1 = sum1 + i;
			}
		}
		// System.out.println("Summary of dividers = " + sum1);

		for (int i = 1; i < num2; i++) {
			if (num2 % i == 0) {
				sum2 = sum2 + i;
			}
		}
		// System.out.println("Summary of dividers = " + sum2);

		if (sum1 == num2 && sum2 == num1) {
			System.out.println("Numbers " + num1 + " and " + num2 + " are Friendly :)");
		}
	}
}
