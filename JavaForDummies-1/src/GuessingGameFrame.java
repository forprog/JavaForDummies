import java.util.Random;

import com.allmycode.dummiesframe.DummiesFrame;

public class GuessingGameFrame {
	public static void main(String args[]) {
		DummiesFrame frame = new DummiesFrame("Guess the number game");
		frame.addRow("Input number 1 to 10");
		frame.setButtonText("Click this button");
		frame.go();
	}
	public static String calculate(int inputNumber) {
		Random random = new Random();
		int randomNumber = random.nextInt(10) + 1;
		if (inputNumber == randomNumber) {
			return "You won";
		} else {
			return "You lose. We thought the random number " + randomNumber + ".";
		}
	}
}
