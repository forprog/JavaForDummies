import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class For3 {
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(in);
		out.print("¬ведите число дл€ вычислени€ факториала: ");
		
		int limit = keyboard.nextInt();
		
		long total = 1;
		for (int i = 1; i <= limit; i++) {
			total *= i;
		}
		out.println(total);
		
		keyboard.close();
	}
}
