import static java.lang.System.out;
import java.util.Scanner;

public class SumPositive {
	public static void main(String args[]) {
		int max = 0;
		int curValue = 0;
		boolean continueInput = true;
		
		Scanner keyboard = new Scanner(System.in);
		
		while (continueInput) {
			curValue = keyboard.nextInt();
			if (curValue > 0) {
				if (max < curValue) {
					max = curValue;
				}
			} else {
				continueInput = false;
			}
		}
		
		out.println(max);
		
		keyboard.close();
		
	}
}
