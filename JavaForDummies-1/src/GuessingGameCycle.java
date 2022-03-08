import static java.lang.System.out;

import java.util.Scanner;
import java.util.Random;

public class GuessingGameCycle {
	static int numGuesses = 0;
	
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		int randomNumber = new Random().nextInt(100) + 1;
		
		out.println("************************");
		out.println("Добро пожаловать в игру!");
		out.println("************************");
		out.println();
		
		int inputNumber = takeNumberInput(keyboard);
		
		
		while (inputNumber != randomNumber) {
			if (inputNumber < randomNumber) {
				out.println("Попробуйте бОльшее число");
			} else {
				out.println("Попробуйте меньшее число");
			}
			inputNumber = takeNumberInput(keyboard);
		}
		
		out.println("Вы угадали после "+numGuesses+" попыток");
		
		keyboard.close();
	}
	
	private static int takeNumberInput(Scanner keyboard) {

		out.print("Введите число от 1 до 100: ");
		int inputNumber = keyboard.nextInt();
		out.println();
		numGuesses++;
		
		return inputNumber;

	}
}
