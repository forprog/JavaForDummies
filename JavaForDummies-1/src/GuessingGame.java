import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Введите число от 1 до 10: ");
		
		int inputNumber = keyboard.nextInt();
		int randomNumber = new Random().nextInt(10) + 1;
		
		if (inputNumber == randomNumber) {
			out.println("*************");
			out.println("*Вы выиграли*");
			out.println("*************");
		} else {
			out.println("Вы проиграли");
			out.print("Случайное число равно ");
			out.println(randomNumber);
		}
		
		out.println("Спасибо за игру");
		
		keyboard.close();
	}
}
