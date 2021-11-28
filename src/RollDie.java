
// Fig. 6.7: RollDie.java
//Roll a six-sided die 60,000,000 times. 
import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		// randomNumbers object will produce secure random numbers
		SecureRandom randomNumbers = new SecureRandom();

		int frequency1 = 0; // count of 1s rolled
		int frequency2 = 0; // count of 2s rolled
		int frequency3 = 0; // count of 3s rolled
		int frequency4 = 0; // count of 4s rolled
		int frequency5 = 0; // count of 5s rolled
		int frequency6 = 0; // count of 6s rolled

		// tally counts for 60,000,000 rolls of a die
		for (int roll = 1; roll <= 60_000_000; roll++) {
			int face = 1 + randomNumbers.nextInt(6); // number from 1 to 6

		}

	}

}
