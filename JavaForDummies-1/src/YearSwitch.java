import static java.lang.System.out;
import java.util.Scanner;

public class YearSwitch {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		out.print("Ââåäèòå ìåñÿö");
		String month = keyboard.next();
		
		out.print("Ââåäèòå ãîä");
		int year = keyboard.nextInt();
		
		boolean IsLeapYear = year % 4 == 0;
		int days = 0;
		
		switch (month.toUpperCase()) {
		case "ßÍÂÀĞÜ":
			days = 31;
			break;
		case "ÔÅÂĞÀËÜ":
			if (IsLeapYear) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		case "ÌÀĞÒ":
			days = 31;
			break;
		case "ÀÏĞÅËÜ":
			days = 30;
			break;
		case "ÌÀÉ":
			days = 31;
			break;
		case "ÈŞÍÜ":
			days = 30;
			break;
		case "ÈŞËÜ":
			days = 31;
			break;
		case "ÀÂÃÓÑÒ":
			days = 31;
			break;
		case "ÑÅÍÒßÁĞÜ":
			days = 30;
			break;
		case "ÎÊÒßÁĞÜ":
			days = 31;
			break;
		case "ÍÎßÁĞÜ":
			days = 30;
			break;
		case "ÄÅÊÀÁĞÜ":
			days = 31;
			break;
		default:
			break;
		}
		
		if (days != 0 ) {
			out.println("Â ìåñÿöå " + month +" " + days + " äíåé");
		} else {
			out.println("Íåò òàêîãî ìåñÿöà");
		}
		
		keyboard.close();
	}
}
