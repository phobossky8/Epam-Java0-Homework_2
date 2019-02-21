import java.util.Random;

public class Task2_1 {

	public static void main(String[] args) {

		int countHeads = 0;
		int countTails = 0;

		Random rand = new Random();

		for (int count = 0; count < 1000; ++count) {
			if (rand.nextInt(2) > 0) {
				countHeads++;
			} else {
				countTails++;
			}
		}
		System.out.println("Heads are " + countHeads + ", Tails are " + countTails);
	}

}
