package Chapter12;

import static java.lang.System.out;

import java.util.Scanner;

public class TextEditor_ArrayList_User {

	public static void main(String[] args) throws Exception {
		TextEditor_ArrayList textEditor = new TextEditor_ArrayList();
		Scanner keyboard = new Scanner(System.in);
		String curInput = "";

		textEditor.FillFromFile("C:\\Users\\forpr\\git\\JavaForDummies\\JavaForDummies-1\\Text.txt");		
		while (true) {
			textEditor.Print();
			out.print("Next command (-1 to exit): ");
			curInput = keyboard.nextLine();
			if (!curInput.equals("-1")) {
				TextEditor_Command curCommand = new TextEditor_Command(curInput);
				out.print("Enter new string: ");
				curCommand.setTextString(keyboard.nextLine());
				
				textEditor.ExecuteCommand(curCommand);
			} else {
				break;
			}			
		}
		
		keyboard.close();
	}

}
