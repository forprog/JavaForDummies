package Chapter12;

public class TextEditor_Command {
	private char commandChar;
	private int commandLine;
	private String textString;

	public String getTextString() {
		return textString;
	}
	public void setTextString(String textString) {
		this.textString = textString;
	}
	public void setCommandChar(char commandChar) throws Exception {
		if ((commandChar == 'i') || (commandChar == 'r') || (commandChar == 'd')) {
			this.commandChar = commandChar;
		} else {
			throw new Exception("Incorrect command");
		}
	}
	public void setCommandLine(int commandLine) {
		this.commandLine = commandLine;
	}
	public char getCommandChar() {
		return commandChar;
	}
	public int getCommandLine() {
		return commandLine;
	}
	
	public TextEditor_Command(String strInput) throws Exception {
		int spacePosition = -1;
		
		spacePosition = strInput.indexOf(" ");
		if (spacePosition == 1) {
			setCommandChar(strInput.charAt(0));
			setCommandLine(Integer.parseInt(strInput.substring(2)));
		} else {
			throw new Exception("Incorrect format");
		}
	}
	
}
