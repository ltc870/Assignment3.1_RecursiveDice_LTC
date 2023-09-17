import java.util.Random;

public class RecDieRoller {

	public void roll() {
		
		Random dice = new Random();
		int rollResult = dice.nextInt(6) + 1;
		System.out.println("Rolled: " + rollResult);
		
		if (rollResult == 2) {
			System.out.println("Found 2, stop rolling!!");
			return;
		} else {
			roll();
		}
	}
}
