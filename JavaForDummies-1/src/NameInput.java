import com.allmycode.dummiesframe.DummiesFrame;

public class NameInput {
	public static void main(String args[]) {
		DummiesFrame frame = new DummiesFrame("Say Hello");
		frame.addRow("Enter ypur name ");
		frame.go();
	}
	
	public static String calculate(String firstName) {
		return "Hi, "+firstName+"!";
	}
}
