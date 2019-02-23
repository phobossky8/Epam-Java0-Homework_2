import java.util.Scanner;

public class Task2_2 {

	public static void main(String[] args) {

		int number = enterNumber();

		maxDigit(number);
		checkForPalindrome(number);
		checkForSimpleness(number);
		findSimpleDividers(number);
		findQuantityOfDiffDigits(number);

		int a = enterNumber();
		int b = enterNumber();

		findLCM(a, b);
		findGCD(a, b);
	}

	public static int enterNumber() {
		int number = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter number: ");

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
			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(number + " is simple");
			} else
				System.out.println(number + " is composite");
		}
	}

	public static void findSimpleDividers(int number) {
		int divider = 0;

		System.out.print("Simple dividers of " + number + " are: ");

		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				divider = i;

				int count = 0;
				for (int j = 1; j <= divider; j++) {
					if (divider % j == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.print(divider + ", ");
				}
			}
		}
		System.out.println("");
	}

	public static void findLCM(int a, int b) {
		int lcm = 0;
		int smallest = a < b ? a : b;
		int i = smallest;
		while (lcm == 0) {
			if (a % i == 0 && b % i == 0) {
				lcm = i;
			}
			i--;
		}
		System.out.println("Least common multiple of " + a + " and " + b + " is: " + lcm);
	}

	public static void findGCD(int a, int b) {
		int gcd = 0;
		int biggerNum = a > b ? a : b;
		while (gcd == 0) {
			if (biggerNum % a == 0 && biggerNum % b == 0) {
				gcd = biggerNum;
			}
			biggerNum++;
		}
		System.out.println("Greatest common divisor of " + a + " and " + b + " is: " + gcd);
	}
	
	public static void findQuantityOfDiffDigits(int number) {
		String string = Integer.toString(number);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (string.contains(String.valueOf(i))) {
                count++;
            }
        }
        System.out.println("The number " + number + " has " + count + " different digits");
		
	}
}
