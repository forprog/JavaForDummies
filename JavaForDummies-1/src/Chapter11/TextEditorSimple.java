package Chapter11;

import static java.lang.System.out;

import java.util.Scanner;

public class TextEditorSimple {

	
	public static void main(String[] args) {
		int curLine = 0;
		TextEditorStrings curStrings = new TextEditorStrings();
		Scanner keyboard = new Scanner(System.in);
		String inputString;
		
		while (curLine != -1) {
			curStrings.printStrings();
			out.print("String to replace (-1 to exit): ");
			curLine = keyboard.nextInt();
			if (curLine >= 0 && curLine < curStrings.Rows.length) {
				out.print("Enter new string: ");
				keyboard.nextLine();
				inputString = keyboard.nextLine();
				curStrings.Rows[curLine] = inputString;
			} 	
		}
		
		keyboard.close();

	}

	
}
