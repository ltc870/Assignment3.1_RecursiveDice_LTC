import java.util.Random;

public class RollDiceThousand {
	private int countOfTwos = 0;
    private int totalRolls = 0;

	public void roll() {
		Random dice = new Random();
	    int rollResult;
	    
	    if (totalRolls < 1000) {
	        rollResult = dice.nextInt(6) + 1; // Assuming a 6-sided die
	        totalRolls++; // Increment the total number of rolls

	        if (rollResult == 2) {
	            countOfTwos++; // Increment the count of twos rolled
	        }

	        if (rollResult == 2) {
	            System.out.println("Roll " + totalRolls + ": you rolled a two " + rollResult);
	        } else {
	            System.out.println("Roll " + totalRolls + ": " + rollResult);
	        }
	        
	        roll(); // Recursively continue rolling
	    } else {
	        // Calculate and print the average
	        double average = (double) countOfTwos / totalRolls;
	        System.out.println("Average of times rolled a two: " + average * 100);
	    }
	}
}
