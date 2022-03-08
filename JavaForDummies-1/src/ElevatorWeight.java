import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class ElevatorWeight {

	public static void main(String args[]) {
		int ElevatorWeightLimit = 430, PersonWeight;
		
		Scanner keyboard = new Scanner(in);
		out.print("Введите вес близнеца: ");
		
		PersonWeight = keyboard.nextInt();
		
		out.println("Все члены семейства");
		String MidString = "Смитов ";
		
		if (ElevatorWeightLimit/PersonWeight >=10) {
			MidString += "Поместятся"; 
		} else {
			MidString += " Не поместятся";
		}
		out.println(MidString);
		out.println("в лифт.");
		
		keyboard.close();
	}
	
}
