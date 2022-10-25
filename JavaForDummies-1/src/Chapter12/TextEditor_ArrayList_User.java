package Chapter12;

import static java.lang.System.out;

import java.util.Scanner;

public class TextEditor_ArrayList_User {

	public static void main(String[] args) throws Exception {
		TextEditor_ArrayList textEditor = new TextEditor_ArrayList();
		Scanner keyboard = new Scanner(System.in);
		String curInput = "";
		TextEditor_Command curCommand;

		textEditor.FillFromFile("C:\\Users\\forpr\\git\\JavaForDummies\\JavaForDummies-1\\Text.txt");		
		while (true) {
			textEditor.Print();
			out.print("Next command (-1 to exit): ");
			curInput = keyboard.nextLine();
			if (!curInput.equals("-1")) {
				try {
					curCommand = new TextEditor_Command(curInput);
				} catch (Exception e) {
					out.println("Command error: ");
					out.println(e.getMessage());
					continue;
				}
				out.print("Enter new string: ");
				curCommand.setTextString(keyboard.nextLine());
				try {
					textEditor.ExecuteCommand(curCommand);					
				} catch (Exception e) {
					out.println("Command execution error: ");
					out.println(e.getMessage());
					continue;
				}
				
			} else {
				break;
			}			
		}
		
		keyboard.close();
	}

}
