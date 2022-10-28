package Chapter12;

import static java.lang.System.out;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class InventoryD {

	public static void main(String[] args) {
		final double boxPrice = 3.25;
		Scanner keyBoard = new Scanner(System.in);
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		
		out.print("How many boxes? ");
		String numBoxesIn = keyBoard.next();
			
		try {
			int numBoxes = Integer.parseInt(numBoxesIn);
			
			if (numBoxes < 0) {
				throw new OutOfRangeException();
			}
			
			if (numBoxes > 1000) {
				throw new NumberTooLargeException();
			}
			
			out.print("Total value is: ");
			out.println(currency.format(numBoxes * boxPrice));
		} catch (OutOfRangeException e) {
			out.print(numBoxesIn);
			out.println("? Impossible!");
		}
		catch (NumberFormatException e) {
			out.println("Not a number");
		}
		catch (Exception e) {
			out.print("Something is wrong, ");
			out.print("thou not clear what. ");
			out.println("Unknown exception type");
		}
		finally {
			keyBoard.close();
		}
		
	}

}
