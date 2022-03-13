import java.io.File;
import java.util.Scanner;
import static java.lang.System.out;

public class DeleteEvidence {

	public static void main(String args[]) {
		File evidence = new File("C:\\","cookedBooks.txt");
		Scanner keyboard = new Scanner(System.in);
		char reply;
		
		do {
			out.print("Delete filed? (y/n)");
			reply = keyboard.findWithinHorizon(".", 0).charAt(0);
		} while (reply != 'y' && reply != 'n');
		
		if (reply == 'y') {
			out.println("OK, delete");
			evidence.delete();
			out.println("File deleted");
		} else {
			out.println("OK, leaving");
		}
		
		keyboard.close();
	}
}
