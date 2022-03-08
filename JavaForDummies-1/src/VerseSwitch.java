import static java.lang.System.out;
import java.util.Scanner;

public class VerseSwitch {
	
	public static void main(String args[]) {
		
		Scanner keyboard = new Scanner(System.in);
		out.print("Почему Эл стоит под дождем (один, два или три)?");
		String verse = keyboard.next();
		
		switch (verse) {
		case "один":
			out.println("Потому что дождь идет очень долго");
			break;
		case "два":
			out.println("Потому что он очень расстроен");
			break;
		case "три":
			out.println("Потому что он все равно уже мокрый");
			break;
		default:
			out.println("Такой причины нет");
			break;
		}
				
		out.println("О-о-о-о-ооооо");
		
		keyboard.close();
		
	}
}
