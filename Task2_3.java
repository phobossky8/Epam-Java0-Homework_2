public class Task2_3 {

	public static void main(String[] args) {
		checkForPerfection(6);
		checkForPerfection(28);
		checkForPerfection(496);
		checkForPerfection(8128);
		checkForPerfection(100500);

	}

	private static void checkForPerfection(int number) {
		int sum = 0;
		for (int i = number / 2; i > 0; i--) {
			if (number % i == 0) {
				sum += i;
			}
		}

		if (sum == number) {
			System.out.println("Number " + number + " is perfect");
		} else {
			System.out.println("Number " + number + " is NOT perfect");
		}
	}
}