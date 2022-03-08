import static java.lang.System.out;
import java.util.Scanner;

public class YearSwitch {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		out.print("������� �����");
		String month = keyboard.next();
		
		out.print("������� ���");
		int year = keyboard.nextInt();
		
		boolean IsLeapYear = year % 4 == 0;
		int days = 0;
		
		switch (month.toUpperCase()) {
		case "������":
			days = 31;
			break;
		case "�������":
			if (IsLeapYear) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		case "����":
			days = 31;
			break;
		case "������":
			days = 30;
			break;
		case "���":
			days = 31;
			break;
		case "����":
			days = 30;
			break;
		case "����":
			days = 31;
			break;
		case "������":
			days = 31;
			break;
		case "��������":
			days = 30;
			break;
		case "�������":
			days = 31;
			break;
		case "������":
			days = 30;
			break;
		case "�������":
			days = 31;
			break;
		default:
			break;
		}
		
		if (days != 0 ) {
			out.println("� ������ " + month +" " + days + " ����");
		} else {
			out.println("��� ������ ������");
		}
		
		keyboard.close();
	}
}
