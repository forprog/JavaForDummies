package Chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextEditor_ArrayList {
	private ArrayList<String> TextData = new ArrayList<>();
	
	public void AddLine(int position, String strToAdd) {
		TextData.add(position, strToAdd);
	}
	public void DeleteLine(int position) {
		TextData.remove(position);
	}
	public void ReplaceLine(int position, String strToReplace) {
		TextData.set(position, strToReplace);
	}
	public void Print() {
		for (String curStr : TextData) {
			System.out.println(curStr);
		}
	}
	public void AddLastLine(String strToAdd) {
		TextData.add(strToAdd);
	}
	
	public void FillFromFile(String fileName) throws FileNotFoundException {
		Scanner diskScanner = new Scanner(new File(fileName),"UTF-8");
		
		while (diskScanner.hasNext()) {
			this.AddLastLine(diskScanner.nextLine());
		}
		diskScanner.close();
	}
	
	public void ExecuteCommand(TextEditor_Command curCommand) {
		switch (curCommand.getCommandChar()) {
		case 'i':
			AddLine(curCommand.getCommandLine(), curCommand.getTextString());
			break;
		case 'r':
			ReplaceLine(curCommand.getCommandLine(), curCommand.getTextString());			
			break;
		case 'd':
			DeleteLine(curCommand.getCommandLine());
			break;
		default:
			break;
		}
	}
}
