import java.util.Scanner;

public class Task2_2 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int number;

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");
		number = scanner.nextInt();

		maxDigit(number);
		checkForPalindrome(number);
		checkForSimpleness(number);

	}

	public static void maxDigit(int number) {
		String numberStr = String.valueOf(number);
		int max = 0;
		int digit = 0;
		for (int i = 0; i < numberStr.length(); i++) {
			digit = Integer.parseInt(numberStr.charAt(i) + "");
			if (max < digit) {
				max = digit;
			}
		}
		System.out.println("MAX digit of number " + number + " is " + max);
	}

	public static void checkForPalindrome(int number) {
		String numberStr = String.valueOf(number);
		StringBuffer revStr = new StringBuffer(numberStr).reverse();
		if (numberStr.equals(revStr.toString())) {
			System.out.println("This number " + number + " is palindrome.");
		} else {
			System.out.println("This number " + number + " is NOT palindrome!!!");
		}
	}

	public static void checkForSimpleness(int number) {
		if (number <= 2) {
			System.out.println(number + " is simple");
		} else {
			int count = 0;
			for (int i = 2; i <= number; i++) {
				if (number % i == 0) {
					count++;
				}
			}
			if( count == 2) {
				System.out.println(number + " is simple");
			} else System.out.println(number + " is composite");
		}
	}

}
