import java.util.Scanner;

public class Task2_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lower limit: ");
        int lowerLim = scanner.nextInt();
        System.out.println("Enter upper limit: ");
        int upperLim = scanner.nextInt();
        
        for(int i = lowerLim; i < upperLim; i++) {
        	
        }
        sumDividers(lowerLim);
	}
	

	
	private static int sumDividers(int number) {
		int sum = 0;
		for (int i = number / 2; i > 0; i--) {
			if (number % i == 0) {
				sum += i;
			}
		}
		
		return sum;
	}

}
