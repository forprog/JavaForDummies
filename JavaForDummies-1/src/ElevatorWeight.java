import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class ElevatorWeight {

	public static void main(String args[]) {
		int ElevatorWeightLimit = 430, PersonWeight;
		
		Scanner keyboard = new Scanner(in);
		out.print("������� ��� ��������: ");
		
		PersonWeight = keyboard.nextInt();
		
		out.println("��� ����� ���������");
		String MidString = "������ ";
		
		if (ElevatorWeightLimit/PersonWeight >=10) {
			MidString += "����������"; 
		} else {
			MidString += " �� ����������";
		}
		out.println(MidString);
		out.println("� ����.");
		
		keyboard.close();
	}
	
}
